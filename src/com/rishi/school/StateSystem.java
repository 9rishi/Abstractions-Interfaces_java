package com.rishi.school;

public class StateSystem extends AbstractEducationSystem{
	
	
	public StateSystem () {
	this.edusystem = EduSystem.STATE;
	}

	@Override
	public void postResults(int rollNo) {
		
		Marks marks = getMarks(rollNo);
		Student std = getstudent(rollNo);
		
		if (marks.getMarks()>90) {
			putResult(std, "Distinciton");
		}
		else if (marks.getMarks()>80) {
			putResult(std, "First class");
		}
		else if (marks.getMarks()>60) {
			putResult(std, "Second class");
		}
		else {
			putResult(std, "fail");
		}
		
	}

}
