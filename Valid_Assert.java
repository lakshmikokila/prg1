import java.util.*;
public class Valid_Assert
{
	public static void main(String args[])
	{
		int age;
		Scanner ob=new Scanner(System.in);
		age=ob.nextInt();
		assert(age>0)&&(age<130);
		System.out.println("The entered age is :"+age);
	}
}