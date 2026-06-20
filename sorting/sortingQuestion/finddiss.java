import java.util.ArrayList;
import java.util.Arrays;

public class finddiss {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        cyclicsorting(arr);
          System.out.println("Sorted: " + Arrays.toString(arr));
       int[] missing = findDisappearedNumbers(arr);
     System.out.println("Missing: " + Arrays.toString(missing));
       
        
    }

     static int[] findDisappearedNumbers(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                list.add(i + 1);
            }
        }

        // convert list → array
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }

     

     static void cyclicsorting(int[] arr){
     int i =0;
     while ((i<arr.length)) {
        int correct = arr[i]-1;
        if(arr[i]!=arr[correct]){
            swap(arr, i, correct);
        }
        else{
            i++;
        }
     }
    }
       static void swap(int[] arr , int first , int second){
    int temp = arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
   }
}
