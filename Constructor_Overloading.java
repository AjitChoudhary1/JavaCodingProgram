package automation_testing_batch;
public class Constructor_Overloading
{
	// para and non para
	
	Constructor_Overloading(int a)
	{
		System.out.println("constructor with para");
	}
	Constructor_Overloading()
	{
		System.out.println("constructor with non para");
	}
	public static void main(String[] args)
	{
		new Constructor_Overloading(10);
		new Constructor_Overloading();
		
		/*Constructor_Overloading c1=new Constructor_Overloading();
		Constructor_Overloading C2=new Constructor_Overloading(10);*/
	}

}
