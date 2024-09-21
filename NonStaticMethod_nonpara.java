package automation_testing_batch;
public class NonStaticMethod_nonpara
{
	void add()
	{
		int a=102;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		
	}
	void sub()
	{
		int a=102;
		int b=20;
		int sub=a-b;
		System.out.println(sub);
	}
	public static void main(String[] args) 
	{
		NonStaticMethod_nonpara n1=new NonStaticMethod_nonpara();
		n1.add();
		n1.sub();
	}

}
