package Final;

public class FinalMethodChild extends FinalparentMethod {
	public void show()
	{ 
		System.out.println("hi");
	}

	public static void main(String[] args) {
		FinalMethodChild obj=new FinalMethodChild();
		obj.show();

	}

}
