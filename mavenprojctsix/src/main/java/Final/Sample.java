package Final;


public class Sample {
final int a=5;
	public void show()
{
	a=4;
	System.out.println(a);
}
	public static void main(String[] args) {
		
		{
			Sample obj=new Sample();
			obj.show();
		}
				

	}

}
