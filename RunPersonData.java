package encapsulation;

public class RunPersonData {
		  public static void main(String[] args) {
		    PersonData myObj = new PersonData();
		    myObj.setName("Ravi RebelStar") ;
		    System.out.println(myObj.getName());
		    myObj.age = 22;
		    System.out.println("Age is: "+myObj.age);
		  }

}
