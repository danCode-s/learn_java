import java.util.*;

public class exerciseFunc {

    public static double findAverage(int n1, int n2, int n3){
        return (n1 + n2 + n3) / 3;
    }

    public static int sumOdd(int n){
        int sum = 0;
        for(int i = 0; i<=n; i++){
            if(i % 2 != 0){
                sum += i; 
            }
        }
        return sum;
    }

    public static double circumCircle(int r){
        return  (2 * 3.14 * r);
    }

    public static boolean votingAge(int age){
        if(age < 0){
            System.out.println("Invalid Number");
            return false;
        }else if(age > 0 && age < 18){
            return false;
        }else{
            return true;
        }

    }

    public static int exponentTwo(int x, int n){
        int result = x;
        for(int i=1; i<n; i++){
            result *= x;
        }
        return result;
    }

    public static void countNumber(){
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        int countP = 0;
        int countZ = 0;
        int countN = 0; 
        int num = 0;
        while(running){
            System.out.print("Enter Numbers: ");
            num = sc.nextInt();
            if(num < 0){
                countN++;
            }else if(num == 0){
                countZ++;
            }else{
                countP++;
            }
            
            System.out.println("Positive num count = " + countP +"\nNegative num count = "+ countN + "\nZero count = " + countZ);           
        }
        sc.close();
    }
    public static void main(String[] args) {
        System.out.println(findAverage(3, 55, 12));

        System.out.println(sumOdd(100));

        System.out.println(circumCircle(23));

        if(votingAge(23)){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        System.out.println(exponentTwo(2, 1));

        
        
        // countNumber();
    }
}
