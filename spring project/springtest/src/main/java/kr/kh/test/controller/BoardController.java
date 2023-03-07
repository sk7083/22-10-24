package kr.kh.test.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.kh.test.service.BoardService;
import kr.kh.test.vo.BoardTypeVO;
import kr.kh.test.vo.MemberVO;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
//	HttpServletRequest request;
	
	@RequestMapping(value = "/board/insert", method = RequestMethod.GET)
	public ModelAndView boardInsert(ModelAndView mv, HttpSession session) {
		MemberVO user = (MemberVO) session.getAttribute("user");
		ArrayList<BoardTypeVO> typeList =
				boardService.getBoardTypeList(user);
		mv.addObject("typeList", typeList);
		mv.setViewName("/board/insert");
//		HttpSession session = request. getSession ();
		
//		
		return mv;
	}
}
