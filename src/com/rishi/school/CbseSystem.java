package com.rishi.school;

public class CbseSystem extends AbstractEducationSystem {
	
		
	public CbseSystem () {
		this.edusystem = EduSystem.CBSE;	}

	@Override
	public void postResults(int rollNo) {
		
		Marks marks = getMarks(rollNo);
		Student std = getstudent(rollNo);
		
		if (marks.getMarks()>90) {
			putResult(std, "10");
		}
		else if (marks.getMarks()>80) {
			putResult(std, "9");
		}
		else if (marks.getMarks()>60) {
			putResult(std, "8");
		}
		else {
			putResult(std, "fail");
		}
	}

}
