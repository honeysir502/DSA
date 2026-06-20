public class Mountain {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,4,3,2,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[]arr){
          int start = 0;
        int end = arr.length - 1;
        
         while ((start<end)) 
            {
                 int mid = start + (end - start) / 2;
                if(arr[mid]>arr[mid+1]){
            // that mean we are in descending side of array
            end=mid;
         }else{
            start=mid+1;
         }
           
            // besause start and end point towards samse element
         }
         

      return  arr[start];
    }
 }
