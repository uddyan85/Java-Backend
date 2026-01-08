package service;

public class Trav {

	private ICourse course;
	
	public Trav(ICourse course) {
		this.course=course;
	}
	
	public Trav() {
		
	}
	
	public Boolean buyTheCourse(Double amount) {
		
		//Composition method:
//		Java j=new Java(); 
//		Boolean status=j.getTheCourse(amount);
//		return status;
//		or
//		return j.getTheCourse(amount);
		
		//using extend java
//		or
//		directly:
		return course.getTheCourse(amount);	
	}
	
	public void setCourse(ICourse course) {
		this.course = course;
	}
	
	public ICourse getCourse() {
		return course;
	}
}
