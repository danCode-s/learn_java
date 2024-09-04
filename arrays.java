import java.util.*;

public class arrays {
    public static void main(String[] args) {
        // int marks[] = new int[4];

        // marks[0] = 99; 
        // marks[1] = 89; 
        // marks[2] = 94;
        // marks[3] = 78;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);

        // int marks[] = {234, 4, 33, 5};
        

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        
        int x = sc.nextInt();
        // linear search
        sc.close();
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println(i);
            }
        }


    }
}
