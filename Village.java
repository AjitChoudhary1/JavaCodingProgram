package inheritance_program.java;

public class Village extends City         // Sub Class    Multi lvl inh
{
	static void Village1()
	{
		System.out.println("Tatarwi");
	}
	void Village2()
	{
		System.out.println("Haveri");
	}
	public static void main(String[] args) 
	{
		
		State1();
		City1();
		Village1();
		Village v1=new Village();
		v1.State2();
		v1.City2();
		v1.Village2();
		
	}

}
