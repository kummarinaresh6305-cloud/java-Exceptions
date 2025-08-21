package exception;
class Book{
	int bid;
	String bname;
	double nprice;
	public Book(int bid,String bname,double nprice)
	{
		this.bid=bid;
		this.bname=bname;
		this.nprice= nprice;
	}
	public Book() {}
	public String toString()
	{
		return "bid:"+bid+"\nbname: "+bname+"\nnprice: "+nprice;
	}
}
public class ToStringDemo {

	public static void main(String[] args) {
		Book b =new  Book(10,"java",100.0);
		System.out.println(b);

	}

}
