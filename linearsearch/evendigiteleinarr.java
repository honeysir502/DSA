public class evendigiteleinarr {
    public static void main(String[] args) {
        int [] nums = {12,345,2,64,7896};
       int ans=evendigit(nums);
       System.out.println(ans);

    }
    static int evendigit(int[]arr){
        int count = 0;
        
     for(int i =0; i<arr.length ; i++){
         int nod =0;
       
        while(arr[i]!=0){
        nod++;
          arr[i]=arr[i]/10;
       }
      if(nod%2==0){
         count++;
        }
     
     }
    return count; }
}
