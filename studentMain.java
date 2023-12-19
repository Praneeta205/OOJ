import java.util.Scanner;
class Subject
{
	int subjectmarks;
	int credits;
	int grade;
}

class student
{
	Subject subject[];
	Scanner s=new Scanner(System.in);
	String name;
	String usn;
	double sgpa=0;
	student()
	{
		int i;	
		subject=new Subject[9];
		for(i=0;i<9;i++)
		{
			subject[i]=new Subject();
		}
	}

	void getstudentdetails()
	{
		System.out.println("enter the name:");
		name=s.next();
		System.out.println("enter the usn:");
		usn=s.next();
	}
	void getmarks()
	{
		for( int i=0;i<8;i++)
		{
			System.out.println("enter the subjectmarks of the subject"+(i+1)+":");
			subject[i].subjectmarks=s.nextInt();
			if (subject[i].subjectmarks>=90 && subject[i].subjectmarks<=100)
			{
				subject[i].grade=10;
			}
			else if (subject[i].subjectmarks>=80)
			{
				subject[i].grade=9;
			}
			else if (subject[i].subjectmarks>=70)
			{
				subject[i].grade=8;
			}
			else if (subject[i].subjectmarks>=60)
			{
				subject[i].grade=7;
			}
			else if (subject[i].subjectmarks>=50)
			{
				subject[i].grade=6;

			}
			else if (subject[i].subjectmarks>=40)
			{
				subject[i].grade=5;

			}
			else 
			{
				subject[i].grade=0;
			}
		
		
				
	
			System.out.println("enter the credits of the subject"+(i+1)+":");
			subject[i].credits=s.nextInt();
			
		}
	}
	void computesgpa()
	{
		int totalcredits=0;
		int totalcredithours=0;
		for(int i=0;i<8;i++)
		{
			
			totalcredits+=(subject[i].grade*subject[i].credits);
			totalcredithours+=(subject[i].credits);
			
		}
		sgpa=(double) totalcredits/totalcredithours;
		System.out.println("SGPA:"+sgpa);
	}
}
class studentMain
{
	public static void main(String args[])
	{
		student s1=new student();
		s1.getstudentdetails();
		s1.getmarks();
		s1.computesgpa();
	}
}
			
			
			
	
	