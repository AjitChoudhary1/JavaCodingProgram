package automation_testing_batch;
public class Static_NonStatic_para 
{
	// STATIC PARAMETRIZED
	
    static void add(int a, int b)
    {
    	System.out.println("addition");
    }
    
    static void add1(int a1, int b1)
    {
    	int sum=a1+b1;
    	System.out.println(sum);
    }
    
    static void login(String un, String pass)
    {
    	System.out.println("login GTM");
    }
    
    static void reg(String fname,String lname,String mno,String dob,char gender)
    {                                       //long mno
    	System.out.println("Reg Completed");
    }
    
    
    
    // NONSTATIC PARAMETRIZED
    
    void add2(int a2, int b2)
    {
    	int sum=a2+b2;
    	System.out.println(sum);
    }
	
    void sub(int a, double b)
    {
    	double total=a-b;
    	System.out.println(total);
    }
    void multiply(int a3, float b3)
    {
    	float multiply=a3*b3;
    	System.out.println(multiply);
    }
    
	public static void main(String[] args) 
	{
   // STATIC PARA
		
		add(1,1);
		add1(100,101);
		login("aj@gtm","@aj8031");
		reg("Aj","Jat","8233668067","20/01/1998",'M');
	                 // 8233668067l
		
		
	// NONSTATIC PARA
		
		Static_NonStatic_para s1=new Static_NonStatic_para();
		s1.add2(101, 102);
		s1.sub(104, 102.2);
		s1.multiply(40, 4.25f);
	}	
}
