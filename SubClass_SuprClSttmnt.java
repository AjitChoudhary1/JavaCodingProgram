package automation_testing_batch;
class Super_Most_Class                      //constructors inheriting by super calling statement
{
	Super_Most_Class()
	{
		System.out.println("Father of Father");
	}
}
class Super_Class    extends Super_Most_Class
{
	Super_Class()
	{
		                                                  // implicitly for non para
		System.out.println("Father");
	}
}
public class SubClass_SuprClSttmnt   extends Super_Class
{
	SubClass_SuprClSttmnt()
	{
		super();                                          // explicitly for non para
		System.out.println("Son");
	}
	public static void main(String[] args) 
	{
		new SubClass_SuprClSttmnt();
		
	}

}
