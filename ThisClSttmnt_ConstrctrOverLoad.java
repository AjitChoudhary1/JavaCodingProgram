package automation_testing_batch;
public class ThisClSttmnt_ConstrctrOverLoad            // cnstrctr overloading by this call sttmnt
{
	
	ThisClSttmnt_ConstrctrOverLoad(String name)
	{
		this('A');                                            //explicitly for this call sttmnt
		System.out.println("Constructor with name");
	}
	ThisClSttmnt_ConstrctrOverLoad(int a)
	{
		this("Jat");
		System.out.println("Constructor with para");
	}
	ThisClSttmnt_ConstrctrOverLoad()
	{
		this(31);                                                 //explicitly for this call sttmnt
		System.out.println("Constructor with non para");
	}
	public static void main(String[] args) 
	{
		//ThisClSttmnt_ConstrctrOverLoad c1=new ThisClSttmnt_ConstrctrOverLoad();
		new ThisClSttmnt_ConstrctrOverLoad();
	}
	
	ThisClSttmnt_ConstrctrOverLoad(char c1)
	{
		System.out.println("Constructor with char");
	}

}
