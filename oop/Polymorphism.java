package oop;

public class Polymorphism extends ConcreateCar{
		public void calculator(int a, int b) {
			int c = a+b;
			System.out.println(c);
		}
		
		public void calculator(int a, int b, int d) {
			int c = a+b;
			double g = c/d;
			System.out.println(g);
			
			
		}

		//method overriding 
		// same method name, same parameter, in different class (use extend)
			
		

	
public static void main(String[] args) {
    	
	Polymorphism polymorphism = new Polymorphism();
	polymorphism.calculator(10,12);
	polymorphism.calculator(10,12,2);
	
	polymorphism.autoHeadLight();
	
	
	
       }

}
