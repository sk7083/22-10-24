package kr.kh.spring.service;

import kr.kh.spring.vo.MemberVO;

public interface MemberService {

	boolean signup(MemberVO member);

	void emailAuthentication(String me_id);

}