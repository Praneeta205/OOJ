import java.util.Scanner;
class Book
{
	String name;
	String author;
	int price;
	int numpages;
	Book(String name,String author ,int price,int numpages)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.numpages=numpages;
	}
	public String toString()
	{
		String name,author,price,numpages;
		name="book name:"+this.name+"\n";
		author="author name:"+this.author+"\n";
		price="price:"+this.price+"\n";
		numpages="numpages:"+this.numpages+"\n";
		return name+author+price+numpages;
	}
}
class BookMain
{
	public static void main(String args[])
	{	
		System.out.println("Praneeta M Reddy,1BM22CS205");
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of books:");
		int n=s.nextInt();
		Book b[];
		b=new Book[n];
		for (int i=0;i<n;i++)
		{
			System.out.println("enter the name of book"+(i+1)+":");
			String name=s.nextLine();
			System.out.println("enter the author of the book");
			String author=s.next();
			System.out.println("enter the price:");
			int price=s.nextInt();
			System.out.println("enter the num of pages:");
			int numpages=s.nextInt();
			b[i]=new Book(name,author,price,numpages);
		}
		System.out.println("details:");
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i].toString());

		}
	}
}		
		
