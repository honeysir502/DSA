import java.util.Arrays;

public class bubblesort {

    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int []arr){
        boolean swapped; 
        // for outer loop
        for(int i =0; i<arr.length; i++){
            swapped = false;
            // for inner loop
            for(int j = 1 ; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    // swap
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break ;
            }
        }
    }
}
