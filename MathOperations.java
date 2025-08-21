package exception;

public class MathOperations {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int count = 0;
		try {
		for(int i=0 ; i < 5 ; i++)
		{
			arr[i] = Integer.parseInt(args[i]);
			count += Integer.parseInt(args[i]);
		}
		double avg = count/5;
		System.out.println("Sum: " + count);
		System.out.println("Average: " + avg);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter only Numbers");
		}
		catch(ArithmeticException e)
		{
			System.out.println("enter marks");
		}
	}
}
