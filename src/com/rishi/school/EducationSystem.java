package com.rishi.school;
/**
 * 
 * @author Gokul
 *
 */
public interface EducationSystem {
	/**
	 * 
	 * @param rollno
	 * @return
	 */
	public Student getstudent(int rollNo);

	/**
	 * 
	 * @param rollno
	 * @return
	 */
	public Marks getMarks(int rollNo);

	/**
	 * 
	 */
	public void postResults(int rollNo);
	
	
	public void putStudent(Student student);
	
	public void putMark(Marks marks);
	
	public void putResult(Student student, String result);
	
	public void print();


}
