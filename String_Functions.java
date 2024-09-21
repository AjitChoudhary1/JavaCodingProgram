package automation_testing_batch;

public class String_Functions                //Old program
{
	public static void main(String[] args) 
	{
		
	String name="school name is indian";
		
		System.out.println(name.length());
		System.out.println(name.substring(0));
		System.out.println(name.substring(6));
		System.out.println(name.substring(7));
		System.out.println(name.substring(0, 7));
		System.out.println(name.substring(7, 11));
		System.out.println(name.substring(12, 14));
        System.out.println(name.substring(15, 21));
        
    String name1="Ajit Choudhary";
    String name2="ajit choudhary";
        
        System.out.println(name1.toLowerCase());
        System.out.println(name2.toUpperCase());
        
        System.out.println(name1.indexOf('A'));
        System.out.println(name1.indexOf('a'));
        System.out.println(name2.indexOf('i'));
        System.out.println(name2.indexOf('u'));
        System.out.println(name2.indexOf('y'));
        
        System.out.println(name1.charAt(8));
        System.out.println(name2.charAt(11));
        System.out.println(name1.charAt(6));
        
    String A="ajit choudhary";
    
        System.out.println(A.trim());
        
        System.out.println(name1.equals(name2));
        System.out.println(A.equals(name2));
        System.out.println(name1.equals(A));
        
        System.out.println(name1.equalsIgnoreCase(name2));
        System.out.println(A.equalsIgnoreCase(name1));
        
        
        
          
        
	}

}

