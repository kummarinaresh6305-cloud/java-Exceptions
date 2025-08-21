package exception;
import java.util.*;
class WithdrawException extends Exception
{
	WithdrawException(String a)
	{
		super(a);
	}
}
class Accounts
{
	int b = 5000;
	void withdraw(int a) throws WithdrawException
	{
		if(a > this.b)
		{
			throw new WithdrawException("Insufficient Balance");
		}
		else
		{
			System.out.println("withdraw success :");
			b = b - a;
			System.out.println("balance:" +b);
		}
	}
}
public class Account {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		Accounts sc = new Accounts();
		try {
			sc.withdraw(a);
		} catch (WithdrawException e) {
			System.out.println(e.getMessage());
		}
        
	}

}
