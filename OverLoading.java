package polyMorphism;

public class OverLoading {
	static int plusMethod(int x, int y) {
		return x+y; 
	}
	static double plusMethod(double x, double y) {
		return x+y;
	}
	public static void main(String[] args) {
		int myNum1 = plusMethod(5, 10);
		double myNum2 = plusMethod(5.5, 7.0);
	
		System.out.println("int : "+myNum1);
		System.out.println("Double : "+myNum2);
	}

}
