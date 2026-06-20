import java.util.Arrays;

public class Missingno {
    public static void main(String[] args) {
        int arr[] = {2,3,4,0,1}  ;      
        cyclicsorting(arr);
      int  ans =  missno(arr);
      System.out.println(ans);
        

        
    }

     static void cyclicsorting(int[] arr){
     int i =0;
     while ((i<arr.length)) {
        if (arr[i]>arr.length-1) {
            i++;
        
        }
        else{ int correct = arr[i];
      
        
             if(arr[i]!=i){
            swap(arr, i, correct);
        }
        else{
            i++;
        }
    }
       
        
       
     }
    }
       static void swap(int[] arr , int first , int second){
    int temp = arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
   }
   static int missno(int[]arr){
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]!=i) {
            return i;
        }else{
            return arr.length;
        }
    }
    return -1 ;
   }
    
}
