package com.rishi.school;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract  class AbstractEducationSystem implements StudentSystem,MarkSystem,ResultSystem,EducationSystem{

	EduSystem edusystem;
	
	static Map<Integer , Student> students = new HashMap<>();    
    
    static Map<Integer , Marks> marks = new HashMap<>();
    
    static Map<Student , String> results = new LinkedHashMap<>();
	@Override
	public Student getstudent(int rollNo) {
		
		return students.get(rollNo);
	}
	
	
	@Override
	public Marks getMarks(int rollNo) {
		//System.out.println(this.getClass().getName());
		return marks.get(rollNo);
	}
	
	
	@Override
	public void putStudent(Student student) {
		student.setEdusystem(edusystem);
		students.put(student.getRollNo(), student);
		
	}
	@Override
	public void putMark(Marks stdMarks) {
		
		marks.put(stdMarks.getRollNo(), stdMarks);
		 
	}
	@Override
	public void putResult(Student student, String result) {
		
		results.put(student, result);
		
	}
	
	public void saveStudent(Student student) {
	//	student.setEdusystem(edusystem);
		putStudent(student);
	}
	
	
	@Override
	public void print() {
		for (Student student: results.keySet()) {
			System.out.println("for student ");
			System.out.println(student.getRollNo());
			System.out.println(student.getName());
			System.out.println("Stream"+student.getEdusystem());
			System.out.println("Result"+results.get(student));
		}
		
	}
	
	
}
