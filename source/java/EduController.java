package smartsuite.app.bp.edu;


import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import smartsuite.security.annotation.AuthCheck;

@Controller
@RequestMapping(value="**/edu/**")
public class EduController {

	@Inject
	EduService eduService;
	
	@RequestMapping(value="findUserList.do")
	public @ResponseBody List findUserList (@RequestBody Map param){
		return eduService.findUserList(param);
	}
	
	@RequestMapping(value="findInfoEdu.do")
	public @ResponseBody Map findUserInfo (@RequestBody Map param){
		return eduService.findUserInfo(param);
	}
	
	@RequestMapping(value="saveInfoEdu.do")
	public @ResponseBody Map saveInfoEdu (@RequestBody Map param){
		return eduService.saveInfoEdu(param);
	}
	
}
