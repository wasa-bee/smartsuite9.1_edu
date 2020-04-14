package smartsuite.app.bp.edu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import smartsuite.app.common.shared.Const;

@Service
@Transactional
public class EduService {

	@Inject
	private SqlSession sqlSession;
	
	public List findUserList(Map param) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("edu.findUserList", param);
	}

	public Map findUserInfo(Map param) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("edu.findUserInfo", param);
	}

	public Map saveInfoEdu(Map param) {
		// TODO Auto-generated method stub
		Map<String, Object> resultInfo = new HashMap<String, Object>();
		Boolean isNew = (Boolean) (param.get("isNew") == null ? false : param.get("isNew"));
		
		if(isNew) {
			sqlSession.insert("edu.insertInfoEdu", param);
		}else {
			sqlSession.update("edu.updateInfoEdu", param);
		}
		
		resultInfo.put(Const.RESULT_STATUS, Const.SUCCESS);
		return resultInfo;
	}
	
	
	
	
}
