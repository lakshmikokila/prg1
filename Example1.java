import java.lang.*;
public class Example1 { 
      
    public static void main(String args[]) { 
        try 
        { 
            Class.forName("One"); 
        } 
        catch (ClassNotFoundException ex) 
        { 
            ex.printStackTrace(); 
        } 
    } 
} 