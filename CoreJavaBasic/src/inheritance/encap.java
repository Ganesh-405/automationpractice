package inheritance;

class encap
	{
	private int empid=10001;
	private double salary=550000;
	public int getempid()
		{
		return empid;
		}

    public double getsalary()
	   {
		return salary;
	   }
	public void setempid(int empid)
	   {
		this.empid=empid;
	   }
    public void setsalary(double salary)
	   {
		this.salary=salary;
	   }
	}
	class encap1
	{
	
public static void main(String[] args) 
    {
	System.out.println("Hello World!");
	encap s=new encap();
	System.out.println("employee id is:"+s.getempid());
	System.out.println("employee salary is:"+s.getsalary());
	s.setempid(10002);
	s.setsalary(400000);
	System.out.println("employee id is:"+s.getempid());
	System.out.println("employee salary is:"+s.getsalary());

}
}
