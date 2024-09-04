 
import java.util.*;
 
public class hello_world{
    public static void main(String args[]){
        System.out.println("hello, world");
        System.out.println("*\n**\n***\n****\n*****");

        String name = "Danish";
        int age = 18;
        double price = 9.99;

        System.out.println(name + " is " + age + " years old, the shirt he bought costs $" + price);

        Scanner sc = new Scanner(System.in);
        String person_name = sc.nextLine();
        sc.close();
        //nextInt()
        //nextFloat()
        System.out.println("Hello "+ person_name);

        System.out.print("A: ");
        Scanner asc = new Scanner(System.in);
        int a = asc.nextInt();

        System.out.print("B: ");
        int b = asc.nextInt();
        asc.close();

        int sum = a + b;
        System.out.println("Sum: " + sum);
        

        

         
    }
}