package automation_testing_batch;
public class Logical_Operators 
{
	public static void main(String[] args) 
	{
		// AND OPERATOR
		   int a=10;
		   int b=20;
		   if(a==b && b==10) //F && F
		   {
			     System.out.println("And OP");
		   }
		   if(a==10 && b==20) //T && T
		   {
			     System.out.println("Other And OP");
		   }
		
		
		// OR OPERATOR
		   int a1=10;
		   int b1=20;
		   if(a1==6 || b1==a1) // c1 False c2 false
		   {
			    System.out.println("OR OP");
		   }
		   if(a1==20 || b1==20) // c1 false c2 true
		   {
			    System.out.println("Other OR OP");
		   }
		
		
		// AND WITH NOT OPERATOR
		   int a2=10;
		   int b2=20;
		   if(!(a2<6 && b2==a)) // c1 false c2 false
		   {
			   System.out.println("And with Not OP");
		   }
		   
		// OR WITH NOT OPERATOR
		   
		   if(!(a2<6 || b2==20)) // c1 false c2 true
		   {
			   System.out.println("Other And with Not OP");
			   
		   }
		
	}

}
