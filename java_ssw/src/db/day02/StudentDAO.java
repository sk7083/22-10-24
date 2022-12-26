package db.day02;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentDAO {
	ArrayList<StudentVO1> selectAllStudent() throws SQLException;
	StudentVO1 selectStudentBySt_num(String st_num) throws SQLException;
	boolean insertStudent(StudentVO1 std);
	boolean deleteStudent(String st_num);
	boolean updateStudent(StudentVO1 std, int submenu);
}




