import java.util.*;

public class qloops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter natural numbers to sum up to: ");
        int number = sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i = 1; i <= number; i++){
            sum += i;
        }
        System.out.println("the sum of natural numbers up to " + number + " is "+ sum);

    }
}
