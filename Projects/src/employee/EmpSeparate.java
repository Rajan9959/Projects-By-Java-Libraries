package employee;

import java.util.Scanner;

public class EmpSeparate {

	Scanner sc = new Scanner(System.in);
	String name;
	String id;
	int sal;
	String loc;
	String company;
	
	public EmpSeparate(String name, String id, int sal, String loc, String company) 
	{
		nameValidation(name);
		idValidation(id);
		salValidation(sal);
		locValidation(loc);
		comValidation(company);
//		this.name = name;
//		this.id = id;
//		this.sal = sal;
//		this.loc = loc;
//		this.company = company;
	}
	
	public void nameValidation(String name)
	{
		while(true)
		{
			try
			{
				if(name.equalsIgnoreCase("tiger") || name.equalsIgnoreCase("scott"))
				{
					this.name=name;
					break;
				}
			}
			catch(NameMismatchException nme)
			{
				System.out.println("Please re-enter the Name");
				name=sc.next();
			}
		}
	}
	
	public void idValidation(String id)
	{
		while(true)
		{
			try 
			{
				if(id.length()==6)
				{
					this.id=id;
					break;
				}
			}
			catch(NotValidIdException nvie)
			{
				System.out.println("Please re-enter the id");
				id=sc.next();
			}
		}
	}
	
	public void salValidation(int sal)
	{
		while(true)
		{
			try
			{
				if(sal >=10000 && sal<=50000)
				{
					this.sal=sal;
					break;
				}
			}
			catch(InvalidSalaryException ise)
			{
				System.out.println("Please re-enter the salary");
				sal=sc.nextInt();
			}
		}
	}
	
	public void locValidation(String loc)
	{
		while(true)
		{
			try
			{
				if(loc.equals("hyderabad") || loc.equals("bangalore") || loc.equals("pune"))
				{
					this.loc=loc;
					break;
				}
			}
			catch(LocationMismatchExcepion lme)
			{
				System.out.println("Please re-enter the location");
				loc=sc.next();
			}
		}
	}
	
	public void comValidation(String company)
	{
		while(true)
		{
			try
			{
				if(company.equalsIgnoreCase("ibm") || company.equalsIgnoreCase("tcs") || company.equalsIgnoreCase("wipro"))
				{
					this.company=company;
					break;
				}
			}
			catch(IllegalCompanyNameException icne)
			{
				System.out.println("Please re-enter the company");
				company=sc.next();
			}
		}
	}
	
	public void display()
	{
		System.out.println("name "+name);
		System.out.println("id "+id);
		System.out.println("sal:"+sal);
		System.out.println("loc:"+loc);
		System.out.println("company:"+company);
	}

	
}
