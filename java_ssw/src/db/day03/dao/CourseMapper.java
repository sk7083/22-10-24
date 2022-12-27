package db.day03.dao;

import db.day03.DBConnector;

public class CourseMapper implements CourseDAO {
	private DBConnector dbConnector;

	public CourseMapper(DBConnector dbConnector) {
		this.dbConnector = dbConnector;
	}
}
