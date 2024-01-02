import java.util.Scanner;
	
abstract class shape
{
	double dim1,dim2,radius;
	shape(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
	shape(double a)
	{
		radius=a;
	}
	abstract void printarea();
}
class rectangle extends shape
{
	rectangle (double a,double b)
	{	
		super(a,b);
	}
	void printarea()
	{
		System.out.println("area of rectangle:"+(dim1*dim2));
	}
}
class triangle extends shape
{
	triangle (double a,double b)
	{	
		super(a,b);
	}
	void printarea()
	{
		System.out.println("area of triangle:"+(dim1*dim2)/2);
	}
}
class circle extends shape
{
	circle (double a)
	{	
		super(a);
	}
	void printarea()
	{
		System.out.println("area of circle:"+(3.14*(radius)*(radius)));
	}
}
class ShapeMain
{
	public static void main(String a[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length and breadth of rectangle:");
		double l=s.nextInt();
		double b=s.nextInt();
		rectangle r=new rectangle(l,b);
		System.out.println("enter the base abd height:");
		double ba=s.nextInt();
		double h=s.nextInt();
		triangle t=new triangle(ba,h);
		System.out.println("enter the radius:");
		double ra=s.nextInt();
		circle c=new circle(ra);
		shape sh;
		sh=r;
		sh.printarea();
		sh=t;
		sh.printarea();
		sh=c;
		sh.printarea();
	}
}
	
	