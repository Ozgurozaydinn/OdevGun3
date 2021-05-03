package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setFirstName("Özgür");
		student1.setLastName("Özaydın");
		student1.setEmail("ozgur@mail.com");
		student1.setPassword("1234");
		
		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.delete(student1);
		userManager.update(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addHomework();
		
		StudentManager studentManager = new StudentManager();
		studentManager.joinToCourse();
		
	}

}
