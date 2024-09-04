// import java.util.*;


public class strings {
    public static void main(String[] args) {

        //Strings are immutable
        //concatenation
        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName + " " + lastName; 
        System.out.println();
        System.out.println(fullName.length());


        for(int i=0; i<fullName.length(); i++ ){
            System.out.println(fullName.charAt(i));

        }


        // compare strings 
        String name1 = "tony";
        String name2 = "tony"; 


        //s1 > s2 --> +ve value 
        //s1 == s2 --> 0
        //s1 < s2 --> -ve value


        // the later character holds more precedence;

        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        // why to use compareTo()   
        if(new String("tony") == new String("tony")){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }


        String sentence = "My name is Tony";
        String userName = sentence.substring(11, sentence.length());

        System.out.println(userName);
    }
}