package com.Bean;

import java.util.HashMap;
import java.util.Map;

public class GradePoint {
	public static String course1,course2,course3,course4,course5;
	public static Map<String,String> dict=new HashMap<>();
	public static void setGradePoint() {
		dict.put("O","10.0");
		dict.put("A+","9.0");
		dict.put("A","8.0");
		dict.put("B+","7.0");
		dict.put("B","6.0");
		dict.put("U","Fail");
	}
	public static String getCourse1() {
		return course1;
	}
	public static void setCourse1(String course) {
		//System.out.println(dict.get(course));
		GradePoint.course1 = dict.get(course);
	}
	public static String getCourse2() {
		return course2;
	}
	public static void setCourse2(String course) {
		//System.out.println(dict.get(course));
		GradePoint.course2 = dict.get(course);
	}
	public static String getCourse3() {
		return course3;
	}
	public static void setCourse3(String course) {
		//System.out.println(dict.get(course));
		GradePoint.course3 = dict.get(course);
	}
	public static String getCourse4() {
		return course4;
	}
	public static void setCourse4(String course) {
		//System.out.println(dict.get(course));
		GradePoint.course4 = dict.get(course);
	}
	public static String getCourse5() {
		return course5;
	}
	public static void setCourse5(String course) {
		//System.out.println(dict.get(course));
		GradePoint.course5 = dict.get(course);
	}
	
}
