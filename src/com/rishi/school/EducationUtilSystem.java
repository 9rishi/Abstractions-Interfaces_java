package com.rishi.school;

public class EducationUtilSystem<T extends EducationSystem> {
	
	    T t;
	  public  EducationUtilSystem(T t){
	    	this.t = t;
	    }
	   public T getObject() {
	    	return t;
	    }
	    public void printObjectType() {
	    	System.out.println(t.getClass().getName());
	    }
         public void printResult() {
			t.print();
		}
         
}
