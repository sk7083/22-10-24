package kr.kh.spring_ssw;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@RequestMapping(value= "/log")
	public ModelAndView home(ModelAndView mv) throws Exception{
	    mv.setViewName("main/home");
	    return mv;
	}
	
	

	
}
