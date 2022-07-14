package oopsConcept;

    interface NameOfStudent{
    	public void studentName();
    	public void instituteName();
    }
    class Students implements NameOfStudent {
    	public void studentName() {
    		System.out.println("Student Name is : Ravi RebelStar");
    	}
    	public void instituteName() {
    		System.out.println("Institute Name is : Bridge Labz");
    	}
    }

public class InterfaceExample {
	public static void main(String[] args) {
		Students studentInfo = new Students();
		studentInfo.studentName();
		studentInfo.instituteName();
	}

}
