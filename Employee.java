public class Employee
{
	private int id;
	private String name;
	private double salary;
	//Constructor
	public Employee(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	//Getter methods
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	//Methods to raise the salary by a given persentage
	public void raiseSalary (double percent)
	{
		if(percent>0)
		{
			double increaseAmount=salary*(percent/100);
			salary += increaseAmount;
			System.out.println("Salary raised by" + percent +"%.New salary: $" + salary);
		}
		else
		{
			System.out.println("Invalid percentage. Salary remains unchanged.");
		}
	}
	public static void main(String[] args)
	{
		//Create an Employee object
		Employee employee1 = new Employee(101,"John Doe", 50000.0);
		//Display initial details
		System.out.println("Employee details before raise:");
		System.out.println("ID:" + employee1.getId());
		System.out.println("Name: "+ employee1.getName());
		System.out.println("Salary: $" + employee1.getSalary());
		
		//Raise the salary by 10%
		employee1.raiseSalary(10);
		//Display details after the raise
		System.out.println("\nEmployee details after raise:");
		System.out.println("ID:" + employee1.getId());
		System.out.println("Name:" + employee1.getName());
		System.out.println("Salary: $" + employee1.getSalary());
	}
}

	