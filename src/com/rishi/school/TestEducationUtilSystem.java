package com.rishi.school;

public class TestEducationUtilSystem {
	
	public static void main(String[] args) {
		EducationUtilSystem< CbseSystem> e = new EducationUtilSystem<CbseSystem>(new CbseSystem());
			e.printObjectType();
	}
}
