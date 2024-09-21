package automation_testing_batch;
public class This_Keyword 
{
	int student_id;
	String name;
	double salary;
	
	void student_details(int student_id,String name,double salary)
	{
		this.student_id=student_id;
		this.name=name;
		this.salary=salary;
	}
	
	public static void main(String[] args) 
	{
		This_Keyword t1=new This_Keyword();
		t1.student_details(31,"Ajit",170500);
		System.out.println(t1.student_id);
		System.out.println(t1.name);
		System.out.println(t1.salary);
		
		
	}

}
