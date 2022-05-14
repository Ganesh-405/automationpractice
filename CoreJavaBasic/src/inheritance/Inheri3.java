package inheritance;
class fruit{
	fruit()
	{
		System.out.println("fruit class built (constr call):");
	}
	public void test() {
		System.out.println("fruits are sweet");
	}
}
class apple extends fruit{
	apple(){
		System.out.println("fruit is apple  (constr call)");
	}
		
	public void shape() {
		System.out.println("shape of apple is round");
		
		}
	}

public class Inheri3 {
public static void main(String[] args) {
	apple app= new apple();
	System.out.println("call method from  fruit  class with object app");
	app.test();
	System.out.println("call method from  apple  class with object app");
	app.shape();
	
}
}
