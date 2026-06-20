public class findminnumber {
    public static void main(String[] args) {
        int[] nums = {32,45,34,67,89,90,12};
        int ans = min(nums);
        // System.out.println(nums.length);
        System.out.println(ans);

    }
  static int min(int arr[]){
    int min = arr[0];
    for(int i=0; i<=arr.length;i++){
        if(arr[i]<min){
            min = arr[i];
            return arr[i];
        
        }
       
        
    }
 return -1; }
}

