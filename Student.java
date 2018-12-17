public class Student
{
  int marks;
  public void display()
  {
    System.out.println("Hello 1");
  }
  public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException
  {

    Student std1 = new Student();
    std1.marks = 50;

    Class cls1 = std1.getClass();

    Object obj1 = cls1.newInstance();
    Student std2 = (Student) obj1;

    System.out.println("\nstd1 marks: " + std1.marks);      // prints 50
    System.out.println("std2 marks: " + std2.marks);        // prints 0
    std2.display();                                         // Hello 1 
                                              // the other way of getting Class object
    Class cls2 = Class.forName("Student");
    Object obj2 = cls2.newInstance();
    Student std3 = (Student) obj2;   
    std3.display();                                         // Hello 1
   }
}



//https://way2java.com/exceptions/java-instantiationexception/