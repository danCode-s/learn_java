public class patterns1 {
    public static void main(String[] args) {

        // rectangle
       

        // int n = 4;
        // int m = 5;
        // for(int i=1; i<=n; i++){
        //     for(int j = 1; j<=m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Hollow Rectange
        // for (int i=1;i<=n;i++){
        //     for(int j=1; j<=m;j++){
        //         if(i == 1 || j==1 || i == n || j == m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }

        // Half Pyramid

        // for(int i=1; i<= 4; i++){
        //     for (int j=1; j<= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Inverted Half Pyramid
        // for (int i = 4; i >= 1; i--) {  // Loop starts from 4 and decrements to 1
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // Flipped and Inverted half pyramid
        // for (int i = 1; i<=4; i++){
        //     for(int j=1; j<=4-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        // Half Pyramid with numbers 
        // for(int i=1; i<= 5; i++){
        //     for (int j=1; j<= i; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // inverted half pyramid with numbers
        // for (int i = 5; i >= 1; i--) {  // Loop starts from 4 and decrements to 1
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
        
        // Another way 
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= 5 - i + 1; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // Floyd's triangle
        
        // int num=1;
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<= i;j++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }

        // 0 - 1 Triangle

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                if((i + j) % 2 == 0){
                    System.out.print("1 "); 
                }else{
                    System.out.print("0 ");
                }
            }System.out.println();
        }
    }
}
