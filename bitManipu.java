public class bitManipu {
    public static void main(String[] args) {
        // Get the third bit (position = 2) of a number n (n = 0101)
        // bit mask 1<<i (i = position)
        // 1 << 2 --> 0001 << 2 --> 0100
        // operation: AND
        // 0100 AND 0101 --> 0100 --> if(non-zero) -> bit=1, i(zero) -> bit=0;


        int n = 5; 
        int pos = 2; 
        int bitMask = 1 << pos;
        System.out.println(bitMask);
        if ((bitMask & n) == 0){
            System.out.println("Bit was zero!");
        } else {
            System.out.println("Bit was 1.");
        }

        // SET the 2nd bit(position=1) of a number n --> (n = 0101 == 5);
        // bit mask = 1 << i
        // 0001 << 1 --> 0010
        // operation = OR
        // 0010 OR 0101 --> 0111 = 7
        // this would essentially convert '5' into '7'.

        
        pos = 1; 
        bitMask = 1 << pos;

        int newNumber = bitMask | n; 
        System.out.println(newNumber);


        // CLEAR the third bit(position = 2) of a number n --> n(0101) = 5;
        // bit mask = 1<<i;
        // 0001 << 2 --> 0100 
        // operation: AND with NOT;
        // ~0100 --> 1011 AND 0101 --> 0001 = 1;
     
        pos = 2;
        bitMask = 1 << pos;
        int clearedNumber = (~bitMask) & n;
        System.out.println(clearedNumber);

        // UPDATE the 2nd bit (position=1) of a number n to 1 --> n(0101) = 5;
        // cases
        // FOR 0(CLEAR): (pos=2)
        //      bit mask: 1<<i --> 1<<2 --> 0001<<2 --> 0100.
        //      Operation: AND with NOT --> ~0100 = 1011 & 0101 --> 0001.
        // For 1(SET):
        //      Bit mask: 1<<i --> 0010
        //      Operation: OR. --> 0010 | 0101 --> 0111 = 7
        

        pos = 1;
        int operation = 1; // if(1)update bit to 1 else update bit to 0;
        bitMask = 1 << pos;
        if(operation == 1){
            newNumber = bitMask | n;
        }else if(operation == 0){
            newNumber = (~bitMask) & n;
        }else{
            System.out.println("Invalid Operation");
        }

        System.out.println(newNumber);
    }
}
