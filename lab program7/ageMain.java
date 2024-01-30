import java.util.Scanner;
class WrongAgeException extends Exception{
	public WrongAgeException(String e){
	super(e);
	}
}
class father{
	private int fage;
	 public father(int fage) throws WrongAgeException{
		if(fage<0){
			throw new WrongAgeException ("age cannot be negative");
		}
		this.fage=fage;
	}
	public void display()
	{
		System.out.println("father age:"+fage);
	}
}
class son extends father{
	private int sage;
	 public son( int sage,int fage) throws WrongAgeException{
		super(fage);
		if(sage>=fage){
			throw new WrongAgeException ("son age cannot be greater than father age");
		}
		if(sage<0)
		{
			throw new WrongAgeException("age cannot be negative");
		}
		this.sage=sage;
	}
	public void show()
	{
		System.out.println(" son age:"+sage);
	}
}
public class ageMain{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the father age:");
		int fatherage=s.nextInt();
		System.out.println("enter sons age:");
		int sonage=s.nextInt();
		try{
			son Son=new son(sonage,fatherage);
			Son.display();
			Son.show();
		}
		catch(WrongAgeException e){
			System.out.println("error:"+e.getMessage());
		}
	}
}
		
		
			

	