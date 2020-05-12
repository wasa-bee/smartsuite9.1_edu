package smartsuite.app.bp.edu;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="**/edu/**")
public class EduController {
	
	@Inject
	EduService eduService;
	
	@RequestMapping(value="findEduList.do")
	public @ResponseBody List<Map<String,Object>> findEduList (@RequestBody Map<String,Object> searchParam) {
		return eduService.findEduList(searchParam);
	}
	
	@RequestMapping(value="saveEduInfo.do")
	public @ResponseBody void saveEduInfo (@RequestBody Map<String,Object> param) {
		eduService.saveEduInfo(param);
	}
	
	@RequestMapping(value="findEduInfo.do")
	public @ResponseBody Map<String,Object> findEduInfo (@RequestBody Map<String,Object> searchParam) {
		return eduService.findEduInfo(searchParam);
	}
	
	@RequestMapping(value="deleteEduInfo.do")
	public @ResponseBody void deleteEduInfo (@RequestBody Map<String,Object> param) {
		eduService.deleteEduInfo(param);
	}
	
	

}
