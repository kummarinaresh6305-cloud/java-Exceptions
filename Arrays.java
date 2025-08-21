package exception;
import java.util.*;
public class Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter the elements in the array");
		try
		{
			for(int i=0;i<a;i++)
			{
				arr[i] = Integer.parseInt(sc.next());
			}
			System.out.println("Enter the index of the array element you want to access");
			int b = sc.nextInt();
			System.out.println("The array element at index "+b+" = "+arr[b]);
			System.out.println("The array element is successfully accessed");
			
		}
		catch(NumberFormatException e)
		{
			System.err.println("java.lang.NumberFormatException");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("java.lang.ArrayIndexOutOfBoundsException");
		}
	}
}
