public class recursionPt1 {

    //print numbers from 1 to 5.

    public static void printNumbers(int n){
        if(n < 6){
            System.out.println(n);
            printNumbers(n + 1);
        }else{
            return;
        }
        
    }    

    // print sum of first n natural numbers.
    public static void naturalSum(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;

        }
        sum += i;
        naturalSum(i+1, n, sum);

    }

    public static void main(String args[]){
        printNumbers(1);
        naturalSum(1, 5, 0);

    }
}
