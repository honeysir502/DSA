public class findinmountain{
public static void main(String[] args) {
    int[]arr= {1,2,3,4,5,3,1};
    int target=3;
    int ans = search(arr, target);
    System.out.println((ans));

    


}
  static int search(int []arr, int target){
  
    int p = peakIndexInMountainArray(arr);
    int a = orderagnosticBS(arr, target ,0 , p);
    if(a!=1){
        return a ;
    }
    return orderagnosticBS(arr, target, p+1, arr.length-1);

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

    static int  orderagnosticBS(int []arr, int target,int start , int end){
        
        boolean isasc = arr[start] <arr[end];
        while (start <= end) {
             int mid = start + (end - start) / 2;
            if(arr[mid]==target){
                return mid;
            }
            else{
                 if(isasc=true){

                    if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            
            }else{
                    if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
                 }
                 
            }
           
            
        }
        return -1;
    }
}