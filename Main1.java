// using this keyword
class Vehicle
{
	int max=210;
	Vehicle(int max)
	{
	this.max=max;
	}
	public void showmax()
	{
	System.out.println("The Max is       "+ max);
	}
}
class Main1
{
	public static void main(String args[])
	{
	Vehicle a=new Vehicle(250);
	a.showmax();
	}
}