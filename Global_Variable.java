package automation_testing_batch;
public class Global_Variable 
{
	String name="Ajit";   //global variable
	void sub()
	{
		int a=100;     //local variable
	}
	static void add()
	{
		int b=90;
	}
	
	// Utilization global variable
	
	String name1="Ajit Choudhary";
	static double ajit_salary=98000.97;
	
	
	public static void main(String[] args) 
	{
		ajit_salary=99000.98;    // value updated of global variable
		
		System.out.println(ajit_salary);
		Global_Variable g1=new Global_Variable();
		g1.name1="Ajit Jat";     // value updated GBV
		
		System.out.println(g1.name1);
		
		
		int c=80;     //local variable
		
		
	}

}
