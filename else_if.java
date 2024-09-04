import java.util.*;
public class else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a == b){
            System.out.println("A is equal to B");
        }else if(a > b){
            System.out.println("A is greater than B");
        }else{ 
            System.out.println("A is less than B or invalid hehe");
        }
        

        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Sallam");
                break;
            case 3:
                System.out.println("Bonjour");
            default:
                System.out.println("Invalid button");
                break;
        }
        sc.close();
    }
}
