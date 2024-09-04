public class adv_patterns {
    public static void main(String[] args) {
        int n = 5;

        // Butterfly Pattern 
        
        // for(int i=1; i<=n; i++){
        //     //1st part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     int spaces = 2 * (n - i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }

        //     // 2nd part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     int spaces = 2 * (n - i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }

        //     // 2nd part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // SOLID RHOMBUS
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=(n - i); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=5; j++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }
        

        // number Pyramid 
        // for(int i=1; i<=n; i++){
        //     // spaces
        //     for(int j=1; j<=(n - i); j++){
        //         System.out.print(" ");

        //     }
        //     // numbers 
        //     for(int j=1; j<=i; j++){
        //         System.out.print(i + " ");

        //     }
        //     System.out.println();
        // }
    

        // palindromic pattern

        // for(int i=1; i<=n; i++){
            
        //     for(int j=1; j<=(n-i); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j>=1; j--){
        //         System.out.print(j);
        //     }
        //     for(int j=2; j<=i; j++){
        //         System.out.print(j);
        //     }

        //     System.out.println();
        // }


        // Diamond Pattern
        n = 4; 
        // upper half
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // stars 
            // no. of stars --> even
            for(int j=1; j<=(2 * i - 1); j++){
                System.out.print('*');
            }
            System.out.println();
        }

        // lower half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2 * i - 1); j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
