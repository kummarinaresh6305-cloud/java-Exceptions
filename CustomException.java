package exception;
class AgeException extends Exception{
	AgeException(String age)
	{
		super(age);
	}
}
class Customer
{
	void setAge(int age) throws AgeException
	{
		if(age < 18 || age > 60)
		{
			throw new AgeException("age should between 18 to 60");
		}
		else
		{
			System.out.println("Your age: "+age);
		}
	}
}
public class CustomException {

	public static void main(String[] args) {
		Customer c = new Customer();
		try {
			c.setAge(1);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			//System.out.println(e);   //
//			System.out.println(e.getMessage());
			System.err.print(e.getMessage());
		}

	}

}

//toString = to represent the object value in String format
//getMessage = returns the message of exception
//printStackTrace = displays the root cause of exception