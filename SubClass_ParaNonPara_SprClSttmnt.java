package automation_testing_batch;
class Super_Most_Class1                      // para non para constructors inheriting by super calling statement
{
	Super_Most_Class1(int a,int b)
	{
		System.out.println("Father of Father1");
	}
}
class Super_Class1    extends Super_Most_Class1
{
	Super_Class1()
	{
		super(31,31);                                  //explicitly for para
		System.out.println("Father1");
	}
}
public class SubClass_ParaNonPara_SprClSttmnt    extends Super_Class1
{
	SubClass_ParaNonPara_SprClSttmnt()
	{
		                                            // implicitly for nonpara
		System.out.println("Son1");
	}
	public static void main(String[] args) 
	{
		new SubClass_ParaNonPara_SprClSttmnt();
		
	}

}
