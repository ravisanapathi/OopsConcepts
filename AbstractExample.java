package oopsConcept;
	
	abstract class Name {
		public abstract void nameOfStudent(); //Abstract Method
		
		public void instituteName() {            // Regular Method
			System.out.println("Institute Name : BridgeLabz");
		}
	}
	class Student extends Name {
		public void nameOfStudent() {
			System.out.println("Student Name is : Ravi RebelStar");
		}
	}
	public class AbstractExample {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.nameOfStudent();
		student.instituteName();
	}
}