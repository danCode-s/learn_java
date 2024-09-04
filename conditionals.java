import java.util.*;

public class conditionals {
    public static void main(String args[]){
        System.out.println("How old r you: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        if(age >= 18){
            System.out.println("Adult");
            
        }else{
            System.out.println("Not an adult");
        }
        // check even and odd
        System.out.println("*****EVEN OR ODD*****");
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("The Number is even");
        }else{
            System.out.println("The number is odd or invalid hehe");
        }
        
        sc.close();
    }

    
}
