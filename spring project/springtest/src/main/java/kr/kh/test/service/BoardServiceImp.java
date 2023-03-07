package kr.kh.test.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.test.dao.BoardDAO;
import kr.kh.test.vo.BoardTypeVO;
import kr.kh.test.vo.MemberVO;

@Service
public class BoardServiceImp implements BoardService{
	
	@Autowired
	BoardDAO boardDao;

	@Override
	public ArrayList<BoardTypeVO> getBoardTypeList(MemberVO user) {
		if(user == null || user.getMe_authority() == 0)
			return null;
		return boardDao.selectBoardTypeList(user.getMe_authority());
	}
}
