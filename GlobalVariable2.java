package automation_testing_batch;
public class GlobalVariable2 
{
	int employeeid;
	double salary;
	String name;
	void employee_Details(int employeeid,double salary,String name)
	{
		System.out.println("GB V Values");
	}
	public static void main(String[] args) 
	{
		GlobalVariable2 g1=new GlobalVariable2();
		g1.employee_Details(2, 88655, "Aj");
		System.out.println(g1.employeeid);
		System.out.println(g1.salary);
		System.out.println(g1.name);

	}

}
