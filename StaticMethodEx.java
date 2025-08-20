package StaticKeyword;

public class StaticMethodEx 
{
	String name;
	int id;
	static String instName="XYZ";
	
	void display()
	{
		System.out.println("Name is:"+name+" Id is:"+id+instName);		
	}
	staic void show()
	{
		System.out.println("Institute name is"+instName);
	}

	public static void main(String[] args) 
	{
		StaticMethodEx obj = new StaticMethodEx();
		obj.display();
		
		StaticMethodEx.show();  
	}

}
