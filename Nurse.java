package inheritance_program.java;
class Hospital                                         // Super most class         Multi Level Inheritance
{
	static void Srfund()
	{
		System.out.println("Fund For Sr, 70000");
	}
	void Jrfund()
	{
		System.out.println("Fund For Jr, 50000");
	}
}
class Doctor extends Hospital                            // Super Class 
{
	static void SrDrSalary()
	{
		System.out.println("Sr Dr Salary, 45000");
	}
	void JrDrSalary()
	{
		System.out.println("Jr Dr Salary, 35000");
	}
}
public class Nurse extends Doctor                       // Sub Class     
{
	static void SrNurseSalary()
	{
		System.out.println("Sr Nurse Salary, 25000");
	}
	void JrNurseSalary()
	{
		System.out.println("Jr Nurse Salary, 15000");
	}
	public static void main(String[] args) 
	{
		
		Srfund();
		SrDrSalary();
		SrNurseSalary();
		Nurse n1=new Nurse();
		n1.Jrfund();
		n1.JrDrSalary();
		n1.JrNurseSalary();
		
	}

}
