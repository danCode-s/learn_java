// import java.util.*;

public class stringBuilder {
    public static void main(String args[]){
        // Strings are immutable


        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        
        //character at index 0.
        System.out.println(sb.charAt(0));

        //set character at index
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //insert a character at index
        sb.insert(0, 'S');
        System.out.println(sb);
        sb.insert(3, 'N');
        System.out.println(sb);


        //delete char at index
        sb.delete(3, 4);
        System.out.println(sb);

        // add character in the end 
        sb.append('y');
        System.out.println(sb);

        // reverse a string

        StringBuilder greet = new StringBuilder("hello");
        
        StringBuilder result = new StringBuilder("");

        for(int i=(greet.length() - 1); i>=0; i--){
            result.append(greet.charAt(i));
        }
        System.out.println(result);

        // another way
        for(int i = 0; i<greet.length()/2; i++){
            int front = i;
            int back =greet.length() - 1 - i; 
            char frontChar = greet.charAt(front);
            char backChar = greet.charAt(back);

            greet.setCharAt(front, backChar);
            greet.setCharAt(back, frontChar);

        }

        System.out.println(greet);
    }
}
