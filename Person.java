package exception;
class AgeExceptions extends Exception{
	AgeExceptions(String a)
	{
		super(a);
	}
}
class Age
{
	void CheckAge(int age) throws AgeExceptions
	{
		if(age < 18 || age > 60)
		{
			throw new AgeExceptions("Your age is not between 18 - 60");
		}
		else
		{
			System.out.println("Your eligible");
		}
	}
}
public class Person {
     public static void main(String[] args){
    	 try
    	 {
    		 String name = args[0];
        	 int age = Integer.parseInt(args[1]);
        	 Age a = new Age();
    		 a.CheckAge(age);
    	 }
    	 catch(ArrayIndexOutOfBoundsException e)
    	 {
    		System.err.println("Enter both inputs"); 
    	 }
    	 catch(NumberFormatException e)
    	 {
    		 System.err.println("Enter input in correct order"); 
    	 }
    	 
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
    	 
     }
}
