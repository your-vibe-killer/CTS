package solid.d3;

public class Calculator {
public enum Operation {ADD, SUBSTRACT, DIVIDE, MULTIPLY};
	
	/*public static void calculate(double a, double b, AddNumbers op) {
		double result=0;
		result=op.add(a, b);
		System.out.println(result);
		
	}
	public static void calculate(double a, double b, SubstractNumbers op) {
		double result=0;
		result=op.substract(a, b);
		System.out.println(result);
		
	}*/
	public static double calculate(double a, double b, Calculation c) {
		return c.calculate(a, b);
	}
}




// design pattern creational, structural, comportamental
//singleton -constructor private 
//o metoda statica care sa returneze instanta
// lazy initialisation? ; not thread safe3 