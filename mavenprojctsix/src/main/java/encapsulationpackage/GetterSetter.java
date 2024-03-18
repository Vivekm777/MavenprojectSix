package encapsulationpackage;

public class GetterSetter {

	public static void main(String[] args) {
		 EmployeeEncapsulation obj=new  EmployeeEncapsulation();
		 obj.setName("Vivek");
         obj.setAge(25);
         System.out.println(obj.getName());
         System.out.println(obj.getAge());
	}

}
