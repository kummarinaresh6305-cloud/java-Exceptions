package exception;
import java.util.*;
class OutOfRangeException extends Exception{
	OutOfRangeException(String a)
	{
		super(a);
	}
}
class Student{
	String name;
	public void setName(String name)
	{
		this.name= name;
	}
	public String getName()
	{
		return name;
	}
	void average(int a,int b,int c) throws OutOfRangeException
	{
		
		if(a>=0 && a<=100 && b>=0 && b<=100 && c>=0 && c<=100)
		{
			System.out.println("Average: "+(((float)a+b+c)/3));
		}
		else
		{
			throw new OutOfRangeException("marks should between 0-100");
		}
	}
}
public class StudentMarks {
	public static void main(String[] args) throws OutOfRangeException {
		Scanner sc = new Scanner(System.in);
		try {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Student s = new Student();
		s.setName("NAGESH");
		System.out.println(s.getName());
		s.average(a, b, c);
		}
		catch(InputMismatchException e)
		{
			System.err.println("enter only digits");
		}
	}
}
