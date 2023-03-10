package com.rishi.school;

public class IbSystem extends AbstractEducationSystem{
	
	  public IbSystem() { this.edusystem = EduSystem.IB; }
	 
	

	@Override
	public void postResults(int rollNo) {
		
		Marks marks = getMarks(rollNo);
		Student std = getstudent(rollNo);
		
		if (marks.getMarks()>90) {
			putResult(std, "A");
		}
		else if (marks.getMarks()>80) {
			putResult(std, "B");
		}
		else if (marks.getMarks()>60) {
			putResult(std, "C");
		}
		else {
			putResult(std, "fail");
		}
	}

}
