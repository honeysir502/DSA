public class linearsearchinrange {
    
    public static void main(String[] args) {
      int [] nums = {37,52,10,-1,98,65};
      int target = 0;
     int ans = Searchfor(nums,target,1,4);
      System.out.println(ans);

    }

  static int Searchfor(int arr[], int target,int start , int end){
         for(int i = start ; i<=end; i++){
            if(arr[i]==target){
                return i;
            }
           
}
 return -1; }
}
