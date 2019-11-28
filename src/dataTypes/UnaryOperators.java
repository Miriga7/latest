package dataTypes;

public class UnaryOperators {
	public static void main(String[] args) {
		
		int Var1, Var2;
		Var1=50;
		
		Var2= -Var1;
			System.out.println("The Var1=" + Var1 + ", The Var2 =" + Var2);
			
		Var1 =50;
		Var2 =Var1++;
			System.out.println("The Var1 = "+ Var1 + ", The Var2 =" +Var2);
			
		 Var1 =50;
		 Var2 =++ Var1;
		 	System.out.println("The Var1 = "+ Var1 + ", The Var2 =" +Var2);
			
		Var1 =50;
		Var2 =Var1--; 		
			System.out.println("The Var1 = "+ Var1 + ", The Var2 =" +Var2);
			
		Var1 =50;
		Var2 = --Var1;
			System.out.println("The Var1 = "+ Var1 + ", The Var2 =" +Var2);
			
		boolean bool1, res;
		bool1=true; 
		
		res= !bool1;
		System.out.println("The bool1 is "+ bool1);
		System.out.println("The result is " + res);
	}

}
