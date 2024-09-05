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

    public static void main(String args[]){
        printNumbers(1);

    }
}
