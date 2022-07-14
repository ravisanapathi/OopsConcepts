package polyMorphism;

public class OverRiding { 
		   
		  void overRide(){
			  System.out.println("Method is OverRiding");
			  }  
		}  
		// Childclass
		class Bike2 extends OverRiding{  
		  //defining the same method as in the parent class
			@Override
		  void overRide(){
			  System.out.println("Method OverRiding is Successfull");
			  }  
		  
		  public static void main(String args[]){  
		  Bike2 obj = new Bike2();//creating object  
		  obj.overRide();//calling method  
		  }  
}
