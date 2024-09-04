public class sorting {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
    public static void main(String[] args) {
        // Bubble Sort
        // push the larger element to the end
        // time complexity = 0(n^2) --> not good.
        // 7 8 3 1 2 
        // sort in ascending order.
        // n - 1 comparisons
        // 1. 7 3 1 2 8
        // 2. 3 1 2 7 8
        // 3. 1 2 3 7 8
        // 4. 1 2 3 7 8
        

        int arr[] = {7, 8, 3, 1, 2};
        int n = arr.length;


        
        // for(int i=0; i< (n - 1); i++){ // n-1

        //     for(int j=0; j<n-i-1; j++){
        //         if(arr[j] > arr[j + 1]){

        //             //swap
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }
         
        // printArray(arr);


        // Selection Sort
        // time complexity --> O(n^2)
        // take the smallest element to the increasing indexes.

        // 7 8 3 1 2
        // 1 7 8 3 2
        // 1 2 7 8 3
        // 1 2 3 7 8
        // 1 2 3 7 8
        // 1 2 3 7 8


        // for(int i=0; i<n - 1; i++){
        //     int smallest = i;
        //     for(int j = i+1; j<n; j++){
        //         if(arr[smallest] > arr[j]){
        //             smallest = j;
        //         }
        //         int temp = arr[smallest];
        //         arr[smallest] = arr[i];
        //         arr[i] = temp;
        //     }
        // }

        // printArray(arr);

    
        // Insertion Sort
        // make two parts of the array --> Sorted | Unsorted and compare the values.
        // 7 8 3 1 2
        // 7 | 8 3 1 2
        // 1. 7 8 | 3 1 2
        // 2. 3 7 8 | 1 2
        // 3. 1 3 7 8 | 2
        // 4. 1 2 3 7 8 

        for(int i=1; i<n; i++){
            int current = arr[i];
            int j = i - 1;
            
            
            
            while (j>=0 && arr[j] > current) {
                
                // printArray(arr);
                // System.out.println(current);
                arr[j+1] = arr[j];
                j--;

            }
            arr[j + 1] = current;
            
        }
        printArray(arr);
    
    }


}
