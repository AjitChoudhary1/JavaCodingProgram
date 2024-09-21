package automation_testing_batch;
class Class2                           //Super class(Parent Class)       Single lvl inh
{
	static void Tharroxx()
	{	
		System.out.println("Tharroxx 5Door White");
	}
	static void ScorpioS11()
	{
		System.out.println("ScorpioS11 Black");
	}
	static void House()
	{
		System.out.println("Farm House");
	}
}
public class Inheritance_Class1   extends Class2   //Sub Class(Child Class)
{
	static void Classic350()
	{
		System.out.println("New Classic350");
	}
	static void Laptop()
	{
		System.out.println("New Laptop");
	}
public static void main(String[] args) 
	{
		Tharroxx();
		ScorpioS11();
		House();
		Classic350();
		Laptop();
		
	}

}
