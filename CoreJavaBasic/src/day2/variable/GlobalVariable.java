package day2.variable;

public class GlobalVariable {
int empId=123;//non-static global variable or class variable
		public static void main(String[] args) {
			
		
	 {
			System.out.println("Program starts..");
			
			//create an instance/object of a class
			GlobalVariable g1;  // object not created here
			g1=new GlobalVariable(); // object create here
			System.out.println("Non-static global variable empId with g1 ref: "+g1.empId);
			g1.empId=456;//updating non-static global variable value
			System.out.println("updated, Non-static global variable empId with g1 ref: "+g1.empId);
			
			//creating again new instance
			GlobalVariable g2 = new GlobalVariable();
			System.out.println("Non-static global variable empId with g2 ref: "+g2.empId);
			System.out.println("Program ends..");
		
	 }

	}

}
