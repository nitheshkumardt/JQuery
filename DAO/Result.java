package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Bean.GradeLetter;
import com.Bean.GradePoint;
import com.Util.DbConnection;

public class Result {
	public static String course1,course2,course3,course4,course5;
	public static void setGradeLetter() {
		GradeLetter.setCourse1(course1);
		GradeLetter.setCourse2(course2);
		GradeLetter.setCourse3(course3);
		GradeLetter.setCourse4(course4);
		GradeLetter.setCourse5(course5);
	}
	public static void setGradePoint() {
		GradePoint.setGradePoint();
		GradePoint.setCourse1(course1);
		GradePoint.setCourse2(course2);
		GradePoint.setCourse3(course3);
		GradePoint.setCourse4(course4);
		GradePoint.setCourse5(course5);
	}
	public static void getResult(String roll) throws SQLException{
		Connection connection=DbConnection.getConnection();
		String sql="Select * from Sem6 where roll_number = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
	     preparedStatement.setString(1, roll);
		ResultSet result=preparedStatement.executeQuery();
		result.next();
		course1=result.getString(2);
		course2=result.getString(3);
		course3=result.getString(4);
		course4=result.getString(5);
		course5=result.getString(6);
		setGradeLetter();
		setGradePoint();
	}
}




