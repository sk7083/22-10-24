package db.day03.dao;

import db.day03.vo.StudentVO;

public interface StudentDAO {
	
	void insertStudent(StudentVO std);
	
	void updateStudent(StudentVO std);
}
