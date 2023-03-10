package com.rishi.school;

public class TestEduSystem {

//	static  EducationSystem cbseSystem =  new CbseSystem();
//	static EducationSystem stateSystem= new StateSystem();
//	static EducationSystem ibSystem= new IbSystem();

	static StudentSystem studentSystem = new CbseSystem();
	static MarkSystem markSystem = new StateSystem();
	static ResultSystem resultSystem = new IbSystem();

	public static void main(String[] args) {

		Student std1 = new Student();
		std1.setRollNo(1);
		std1.setName("rishi");
		Marks mark1 = new Marks();
		mark1.setRollNo(1);
		mark1.setMarks(89);
		//
		Student std2 = new Student();
		std2.setRollNo(2);
		std2.setName("ff");
		Marks mark2 = new Marks();
		mark2.setRollNo(2);
		mark2.setMarks(33);
		//
		Student std3 = new Student();
		std3.setRollNo(3);
		std3.setName("dc");
		std3.setEdusystem(EduSystem.CBSE);
		Marks mark3 = new Marks();
		mark3.setRollNo(3);
		mark3.setMarks(90);
		//
		Student std4 = new Student();
		std4.setRollNo(4);
		std4.setName("ff");
		std4.setEdusystem(EduSystem.CBSE);
		Marks mark4 = new Marks();
		mark4.setRollNo(4);
		mark4.setMarks(88);

		//
		Student std5 = new Student();
		std5.setRollNo(5);
		std5.setName("vrev");
		Marks mark5 = new Marks();
		mark5.setRollNo(5);
		mark5.setMarks(100);
		//
		Student std6 = new Student();
		std6.setRollNo(6);
		std6.setName("gok");
		Marks mark6 = new Marks();
		mark6.setRollNo(6);
		mark6.setMarks(88);
		
		studentSystem.putStudent(std1);
		studentSystem.putStudent(std2);
//		studentSystem.putStudent(std3);
//		studentSystem.putStudent(std4);
//		studentSystem.putStudent(std5);
//		studentSystem.putStudent(std6);
		((StudentSystem) markSystem).putStudent(std3);
		((StudentSystem) markSystem).putStudent(std4);
		
		((StudentSystem) resultSystem).putStudent(std5);
//		((StudentSystem) resultSystem).putStudent(std6);

		((EducationSystem) resultSystem).putStudent(std6);
		
		markSystem.putMark(mark1);
		markSystem.putMark(mark2);
		markSystem.putMark(mark3);
		markSystem.putMark(mark4);
		markSystem.putMark(mark5);
		markSystem.putMark(mark6);
		
		resultSystem.postResults(1);
		resultSystem.postResults(2);
		resultSystem.postResults(3);
		resultSystem.postResults(4);
		resultSystem.postResults(5);
		resultSystem.postResults(6);

//		resultSystem.print();
		
		EducationUtilSystem<EducationSystem> e =  new EducationUtilSystem<EducationSystem>(new StateSystem());
		e.printResult();
		
//		stateSystem.putStudent(std3);
//		stateSystem.putStudent(std4);
//		stateSystem.putMark(mark3);
//		stateSystem.putMark(mark4);
//		
//		cbseSystem.putStudent(std1);
//		cbseSystem.putStudent(std2);
//		cbseSystem.putMark(mark1);
//		cbseSystem.putMark(mark2);
//		
//		cbseSystem.postResults(1);
//		cbseSystem.postResults(2);
//		
//		stateSystem.postResults(4);
//		stateSystem.postResults(3);
//		

//		
//		
//		//
//		ibSystem.putStudent(std6);
//		ibSystem.putStudent(std5);
//		ibSystem.putMark(mark6);
//		ibSystem.putMark(mark5);
//		ibSystem.postResults(6);
//		ibSystem.postResults(5);
//		//
//		
////		stateSystem.print();
//		EducationSystem e = (EducationSystem) cbseSystem;
//		e.print();
//	
////		ibSystem.print();
//		if (stateSystem instanceof EducationSystem) {
//			System.out.println("true");
//		}	
//		

	}
}
