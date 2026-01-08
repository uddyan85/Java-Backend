package main;

import service.Java;
import service.SpringBoot;
import service.Trav;

public class LaunchApp {

	public static void main(String[] args) {

//		Trav t=new Trav(); //Target class
		
//	         constructor injection 
		Trav t=new Trav(new Java()); //Target class
		
//		 t.setCourse(new Java());
		 t.setCourse(new SpringBoot());
		boolean status=t.buyTheCourse(599.5);
		
		if(status) {
			if(status) {
				System.out.println("Course Enrolled Successfully.");
			} else {
				System.out.println("Failed to enroll for the course.");
			}
		}
	}

}
