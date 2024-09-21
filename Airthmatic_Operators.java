package automation_testing_batch;
public class Airthmatic_Operators 
{
   static void add()
   {
	 int a=15;
	 int b=15;
	 int c=a+b;
	 System.out.println(c);
   }
   
   static void sub()
   {
	   int a=20;
       int b=40;
       int c=b-a;
       System.out.println(c);
   }
   
   static void multi()
   {
	   int a=8;
	   int b=3;
	   int c=a*b;
	   System.out.println(c);
   }
   
   static void divide()
   {
	   int a=30;
	   int b=10;
	   int c=a/b;
	   System.out.println(c);
   }
   
   static void modulus()
   {
	   int a=35;
	   int b=20;
	   int c=a%b;
	   System.out.println(c);
   }
	
   public static void main(String[] args) 
    {
		add();
		sub();
		multi();
		divide();
		modulus();
	}
}
