package automation_testing_batch;
public class Conditional_Operators 
{
	public static void main(String[] args) 
	{
		//IF
		
		int a=15;
		int b=30;
		
		if(a<b) //true
		{
			System.out.println("a<b");
		}
		
		int a2=3;
		int b2=5;
		
		if(a2<=b2)  //true
		{
			System.out.println("no of house is correct");
		}
		
		
		//IF ELSE
		
		int age=55;
	  //if(age>=18)
		if(age<=18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			System.out.println("not eligible to vote");
		}
		
		
		char gender1='M';
		char gender2='F';
		
		//if(gender1=='M')
		  if(gender1=='M')
		  if(gender2=='F')
		{
			System.out.println("He is Master");
		}
		else
		{
			System.out.println("She is Teacher");
		}
		
		
		// IF ELSE IF
		
		int a1=20;
		int b1=30;
		int c=40;
		
	  //if(a1>b1) false	
	  //if(a1<b1) //true
		if(a1==b1) //false
		{
			System.out.println("1");
		}
	  //else if(b1>c1) false
	  //else if(b1<c1) //true
		else if(b1<c) //true
		{
			System.out.println("2");
		}
		else
		{
			System.out.println("3");
		}
		
		
		//NESTED IF ELSE
		
		  int a3=10;
		  int b3=20;
		  int c3=30;
		//if(a3>b3) //false
		//if(a3<b3) //true
		//if(b3<a3) //false
		  if(a3<b3) //true
		  {
			//if(b3>c3) //false
			//if(b3>c3) //false
			//if(b3<c3) //true
			  if(a3>c3) //false
			  {
				  System.out.println("1");
			  }
			  else
			  {
				  if(a3==b3)
				  {
					  System.out.println("2");
				  }
				  else
				  {
					  System.out.println("3");
				  }
			  }
		  }
		  else
		  {
			  System.out.println("4");
		  }
		  
		  
		  
	/*	// BANGALORE BUS TICKET
		  
		   char Gender3='M';
		   char gender4='F';
		   
		   if(gender3=='M')
		   {
			   if()
			   {
				   System.out.println("free");
			   }
			   else
			   {
				   if()
				   {
					   System.out.println("half ticket");
				   }
				   else
				   {
					   System.out.println("full ticket");
				   }
			   }
			   
		   }
		   else
		   {
			   System.out.println("free");
		   }*/
	}
	

}
