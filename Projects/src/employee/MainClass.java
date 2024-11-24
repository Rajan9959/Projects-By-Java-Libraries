package employee;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		boolean start=true;
		while(true)
		{
			System.out.println("Enter your choice : \n 1.New Employee \n 2.Annaul Salary");
			int choice = sc.nextInt();
			if(choice==1)
			{
				System.out.println("Enter your name : ");
				String name=sc.next();
				System.out.println("Enter your id : ");
				String id=sc.next();
				System.out.println("Enter your salary : ");
				int sal=sc.nextInt();
				System.out.println("Enter your loc : ");
				String loc=sc.next();
				System.out.println("Enter your company : ");
				String company=sc.next();
				Employee e = new Employee(name,id,sal,loc,company);
				e.display();
			}
//			if(choice==2)
//			{
//				e.annualSalary(sal);
//			}
			start=false;
		}
	}
}
