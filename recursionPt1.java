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
    // print factorial of a number n
    public static long factorial(int n){ // long used since factorials tend to be very long ;)
        
        if(n == 1 || n == 0){
            return 1;
        }
        long factorial = n * factorial(n - 1);
        return factorial;
        
    }


    // print the fibonnaci series till nth term. a, b,  --> c=a+b.

    public static void fibonnaciSeries(int a, int b, int n){
        // a = 2nd last term
        // b = last term.

        if(n == 0){
            return;            
        }

        int c = a + b;
        System.out.println(c);
        fibonnaciSeries(b, c, n - 1);
        
    }
    public static void main(String args[]){
        printNumbers(1);
        naturalSum(1, 5, 0);
        System.out.println(factorial(5));
        
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        fibonnaciSeries(a, b, n);


    }
}
