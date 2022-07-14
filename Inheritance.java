package oopsConcept;

public class Inheritance {  
		public int salary=40000;  
		}  
		class Programmer extends Inheritance{  
		public int bonus=10000;
		
		 public static void main(String args[]){  
		   Programmer employee = new Programmer();  
		   System.out.println("Programmer salary is:"+employee.salary);  
		   System.out.println("Bonus of Programmer is:"+employee.bonus);  
		}

}
