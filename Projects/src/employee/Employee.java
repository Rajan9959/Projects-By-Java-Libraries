package employee;

import java.util.Scanner;

public class Employee 
{
	
		Scanner sc=new Scanner(System.in);
		String name;
		String id;
		int sal;
		String loc;
		String company;

		public Employee(String name,String id,int sal,String loc,String company)
		{
			int nameStatus=0;
			int idStatus=0;
			int salStatus=0;
			int locStatus=0;
			int companyStatus=0;

			// logic for nameStatus
			while(true)
			{
				try
				{
					if(name.equalsIgnoreCase("tiger") || name.equalsIgnoreCase("scott"))
					{
						//this.name=name;
						nameStatus=1;
						break;
					}
				}
				catch(NameMismatchException nme)
				{
					System.out.println("Please re-enter the Name");
					name=sc.next();
				}
			}

			//logic for idStatus
			while(true)
			{
				try 
				{
					if(id.length()==6)
					{
						//this.id=id;
						idStatus=1;
						break;
					}
				}
				catch(NotValidIdException nvie)
				{
					System.out.println("Please re-enter the id");
					id=sc.next();
				}
			}

			//logic for salary status
			while(true)
			{
				try
				{
					if(sal >=10000 && sal<=50000)
					{
						//this.sal=sal;
						salStatus=1;
						break;
					}
				}
				catch(InvalidSalaryException ise)
				{
					System.out.println("Please re-enter the salary");
					sal=sc.nextInt();
				}
			}
		
			//logic for location status
			while(true)
			{
				try
				{
					if(loc.equals("hyderabad") || loc.equals("bangalore") || loc.equals("pune"))
					{
						//this.loc=loc;
						locStatus=1;
						break;
					}
				}
				catch(LocationMismatchExcepion lme)
				{
					System.out.println("Please re-enter the location");
					loc=sc.next();
				}
			}
		
			//logic for company status
			while(true)
			{
				try
				{
					if(company.equalsIgnoreCase("ibm") || company.equalsIgnoreCase("tcs") || company.equalsIgnoreCase("wipro"))
					{
						//this.company=company;
						salStatus=1;
						break;
					}
				}
				catch(IllegalCompanyNameException icne)
				{
					System.out.println("Please re-enter the company");
					company=sc.next();
				}
			}
	


			if(nameStatus==1 && idStatus==1 && salStatus==1 && locStatus==1 && companyStatus==1)
			{
				this.name=name;
				this.id=id;
				this.sal=sal;
				this.loc=loc;
				this.company=company;
			}
		}

		public void display()
		{
			System.out.println("name: "+name);
			System.out.println("id :"+id);
			System.out.println("sal:"+sal);
			System.out.println("loc:"+loc);
			System.out.println("company:"+company);
		}
	
}
