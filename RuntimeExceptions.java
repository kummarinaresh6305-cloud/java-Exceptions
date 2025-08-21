package exception;

public class RuntimeExceptions {
     public static void main(String[] args) {
    	try {
     	 //arthematic
    	 int n1 = Integer.parseInt(args[0])/Integer.parseInt(args[1]);
    	 System.err.println(n1);
//    	// arrayindexoutofbound
//    	 int[] n2 = {1,2,3,4,5,6,7};
//    	 System.out.println(n2[7]);
//    	// Stringoutofbound
//    	 String s = "Welcome";
//    	 System.out.println(s.charAt(8));
//    	// negative arraylist
//    	 int[] n4 = new array[-5];
//    	 //numberformatexception
//    	 String s2 = "abc";
//    	 int w = Integer.parseInt(s2);
//    	// nullpaointexception
//    	 String a = null;
//    	 System.out.println(a.equals("apple"));
    	 }
    	catch(ArithmeticException e)
    	{
   		System.err.println("Division by zero not possible");
     	}
    	catch(ArrayIndexOutOfBoundsException e)
    	{
    		System.err.println("required two numbers");
    	}
    	catch(NumberFormatException e)
    	{
    		System.err.println("enter only number");
    	}
    	catch(RuntimeException e)
    	{
    		System.err.println("RuntimeException occured");
    	}
    	catch(Exception e)
    	{
    		System.err.println("Exception occured");
    		
    	}
    	finally {
    		System.out.println("end of program");
    	}
     }
}
