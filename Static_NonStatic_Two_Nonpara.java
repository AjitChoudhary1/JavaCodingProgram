package automation_testing_batch;
public class Static_NonStatic_Two_Nonpara 
{
    static void ajit()
    {
    	System.out.println("Ajit Choudhary");
    }
    static void village()
    {
    	System.out.println("Tatarwi");
    }
    void Choudhary()
    {
    	System.out.println("Choudhary Sahab");
    }
    void Jatji()
    {
    	System.out.println("Jat Ji");
    }
	

	public static void main(String[] args) 
	{
		ajit();
		village();
		Static_NonStatic_Two_Nonpara S1=new Static_NonStatic_Two_Nonpara();
		S1.Choudhary();
		S1.Jatji();
		
	}
}
