package exception;
import java.io.IOException;
import java.util.*;
public class except {

	public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         try {
        	 int i1 = sc.nextInt();
             int i2 = sc.nextInt();
        	 int c = i1 / i2;
        	 System.out.println(c);
         }
        catch(ArithmeticException e) {
        	System.out.println("can not divided by 0"); 
         }
         catch(InputMismatchException e)
         {
        	 System.out.println("input only numbers"); 
         }
         finally {
        	 System.out.println("end of program");  
         }
        
	}

}
