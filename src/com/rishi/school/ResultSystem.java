package com.rishi.school;

public interface ResultSystem {
	
	public void postResults(int rollNo);
	
	public void putResult(Student student, String result);

	public void print();
}
