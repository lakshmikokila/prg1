enum Car
{
	car1(800),car2(200),car3(15);
	private 
	int price;
	Car(int p)
	{
	price=p;
	}
	int getPrice()
	{
	return price;
	}
}
public class One
{
	public static void main(String args[])
	{
	for(Car c:Car.values())
		System.out.println(c+" Costs" +c.getPrice()+" Dollors");
	}
}