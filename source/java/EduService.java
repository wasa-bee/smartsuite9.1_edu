package smartsuite.app.bp.edu;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class EduService {
	
	@Inject
	SqlSession sqlSession;
	
	public List<Map<String,Object>> findEduList (Map<String,Object> searchParam) {
		return sqlSession.selectList("edu.findEduList", searchParam);
	}
	
	public void saveEduInfo (Map<String,Object> param) {
		if(param.get("is_new") != null) {
			sqlSession.insert("edu.insertEduInfo", param);
		} else {
			sqlSession.update("edu.updateEduInfo", param);
		}
		
	}
	
	public Map<String,Object> findEduInfo (Map<String,Object> searchParam) {
		return sqlSession.selectOne("edu.findEduInfo", searchParam);
	}
	
	
	public void deleteEduInfo (Map<String,Object> param) {
		sqlSession.delete("edu.deleteEduInfo", param);
		
	}
	
	
	
	
}
