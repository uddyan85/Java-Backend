package service;

public class Java implements ICourse {

	@Override
    public Boolean getTheCourse(Double amount) {
		System.out.println("Java Course is purchased and fees paid is " + amount);
		return true;
	}
}
