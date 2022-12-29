package example.db.main;

import org.apache.ibatis.session.SqlSession;

import db.day4.dao.StudentDAO;



public class MainController {
	
	private SqlSession session;
	private StudentDAO studentDao;
	
	public MainController(SqlSession session) {
		this.session = session;
		studentDao = session.getMapper(StudentDAO.class);
	}

	public void run() {
		/* 학생 추가
		 * 학생 수정
		 * 학생 조회
		 * 프로그램 종료
		 * */
		
	}

}
