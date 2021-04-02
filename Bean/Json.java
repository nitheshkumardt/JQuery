package com.Bean;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
public class Json {
	public static JSONObject gLetter = new JSONObject();
	public static JSONObject gPoint = new JSONObject();
	public static String getJsonLetter() throws IOException {
		gLetter.put("course1",GradeLetter.getCourse1());
		gLetter.put("course2",GradeLetter.getCourse2());
		gLetter.put("course3",GradeLetter.getCourse3());
		gLetter.put("course4",GradeLetter.getCourse4());
		gLetter.put("course5",GradeLetter.getCourse5());
		System.out.println("WELCOME!");
		PrintWriter pw = new PrintWriter("C:\\Users\\Nithesh Kuma D\\eclipse-workspace\\JQureyAjax\\file.json");
        pw.write(gLetter.toJSONString());
		System.out.println("JSON-->"+gLetter.get("course1"));
		 pw.flush();
	     pw.close();
		return gLetter.toJSONString();
	}
	public static String getJsonPoint() throws IOException {
		gPoint.put("course1",GradePoint.getCourse1());
		gPoint.put("course2",GradePoint.getCourse2());
		gPoint.put("course3",GradePoint.getCourse3());
		gPoint.put("course4",GradePoint.getCourse4());
		gPoint.put("course5",GradePoint.getCourse5());
		StringWriter out = new StringWriter();
		gPoint.writeJSONString(out);
		String jsonText = out.toString();
	      System.out.print(jsonText);
		return jsonText;
	}
}
