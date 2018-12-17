import java.lang.*;
public class StringFunction
{
	public static void main(String args[])
	{
	String str="We Win";
	int len=str.length();
	System.out.println(len);

	char result=str.charAt(3);
	System.out.println(result);

	String str1=new String("Welcome to java");
	char[] str2=new char[5];
	str1.getChars(3,5,str2,0);
	System.out.println("Value:");
	System.out.println(str2);

	String s1="Java";
	String s2="Java";
	boolean result1=s1.equals(s2);
	System.out.println(result1);

	String com1="Strings";
	String com2="String are equal";
	int result3=com1.compareTo(com2);
	System.out.println(result3);

	
	System.out.println(str1.startsWith("Welcome"));

	System.out.println(str1.endsWith("Java"));	

	System.out.println(str1.indexOf("m"));

	System.out.println(str1.lastIndexOf("v"));

	System.out.println(str1.substring(10));

	System.out.println(str1.concat(s1));

	System.out.println(s1.replace('a','A'));

	System.out.println(com1.toUpperCase());

	System.out.println(com1.toLowerCase());
	
	
	}
}