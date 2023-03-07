package kr.kh.test.service;

import java.util.ArrayList;

import kr.kh.test.vo.BoardTypeVO;
import kr.kh.test.vo.MemberVO;

public interface BoardService {

	ArrayList<BoardTypeVO> getBoardTypeList(MemberVO user);

}
