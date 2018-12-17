abstract class Game
{
	int score;
	void display()
	{
	System.out.println("Display Method");
	}
	abstract void compute();
	abstract void play();
}
class Cricket extends Game
{
	void play()
	{
	System.out.println(" Cricket game starts:");
	}
	void compute()
	{
	System.out.println("Computing the calculation");
	}
}
public class Demo
{
	public static void main(String args[])
	{
	Cricket d1=new Cricket();	
	d1.play();
	d1.compute();
	d1.display();
	}
}