import java.util.*;

public class functions {
    
    public static void sayMyName(String name){
        System.out.println(name);

        return;
    }

    public static int sumNums(int num1, int num2){
        return num1 + num2;
    };

    public static int findProduct(int num1, int num2){
        return num1 * num2;
    }

    public static int findFactorial(int num1){

        if(num1 < 0){
            System.out.println("Invalid Number");
            return -1;
        }
        int result = 1;
        for(int i=num1; i>=1; i--){
            result *= i;
        }
        return result;

    }
    
    public static void main(String[] args) {
        System.out.print("Whats ur name: ");
        Scanner sc = new Scanner(System.in);

        String userName = sc.nextLine();
        sayMyName(userName);

        System.out.println("Enter the Numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        sc.close();


        int sum = sumNums(number1, number2);
        System.out.println(number1 + " + " + number2 + " = " + sum);


        System.out.println(findFactorial(number1));
    }
}
