import java.util.*;
public class Employee{
	int eNo;
	String eName;
	float eSalary;
	public void empl(){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Employee Number:");
		eNo = s.nextInt();
		System.out.print("Enter the Employee Name:");
		eName = s.next();
		System.out.print("Enter the Employee Salary:");
		eSalary = s.nextFloat();
	}
	public void display(){
	System.out.println(" Employee Number  : " + eNo);
	System.out.println(" Employee Name    : " + eName);
	System.out.println(" Employee Salary  : " +  eSalary);	
	}
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Employees:");
		n = sc.nextInt();	
		Employee obj[] = new  Employee[n];
     for(int i=0;i<n;i++){
		 obj[i] = new  Employee();
		 obj[i].empl();
	 }
    System.out.println(".............Employee Details.............");
	for(int i=0;i<n;i++)
	{
		obj[i].display();
	}
	 int x;
		 System.out.println("enter the number to search an employee");
		 x=sc.nextInt();
		int flag=1;
		 for(int i=0;i<n;i++)
		 {
			if(obj[i].eNo==x)
			{
				obj[i].display();
			}
			else
			{
				flag=0;
			}
		 }
	}
		 if(flag==0)
		 {
			  System.out.println("not found");
		 }
}