package aggregation;

public class Employee {
	int id;
	String name;
	Address address;
	
	Employee(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display()
	{
		
		System.out.println(id+"    " +name);
		System.out.println(address.city+"  "+address.state+"  "+address.country);
	}
	public static void main(String[] args) {
		
Address obj=new Address("thrissur","kerala","India");
Address obj1=new Address("pala","jhb","hgf");
Employee e=new Employee(75,"Arun",obj);
Employee e1=new Employee(45,"rahul",obj1);
e.display();
e1.display();
	}

}
