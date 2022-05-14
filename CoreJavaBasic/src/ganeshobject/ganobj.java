package ganeshobject;

public class ganobj
{
	void display()
	{
		System.out.println("i am Display");
		
	}

}
class ObjectClass1 extends ganobj
{
	static int last_roll=100;
	int roll_no;
	ObjectClass1()
	{
		roll_no=last_roll;
		last_roll++;
	}
	
public static void main(String[] args) 
{
	ObjectClass1 O=new ObjectClass1();
	System.out.println(O);
	System.out.println(O.toString());
	ganobj g=new ganobj();
	System.out.println(g);
	System.out.println(g.toString());
	ganobj g2=new ganobj();
	System.out.println(g2);
	
}
	
	
}	

