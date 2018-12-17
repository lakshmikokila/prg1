                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 class Super_class
{
	int num=20;

	public void display()
	{
	System.out.println("This is display Method of super class");
	}
}
public class Sub_class extends Super_class
{
	public void display()
	{
	System.out.println("This is the display method of Sub Class");
	}
	public void method()
	{
	Sub_class sub=new Sub_class();
	sub.display();
	super.display();
	System.out.println(" Value of sub:" +sub.num);
	System.out.println(" Value of sub:" +super.num);
	}
public static void main(String args[])
{
	Sub_class obj=new Sub_class();
	obj.method();
}
}
	

	                                                                                                                              