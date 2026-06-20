public class maxwealth {
    public static void main(String[] args) {

        int[][] accounts = {  {1,2,3},{4,5,7},{9,12,98}
    };
           int ans = maximumwealth(accounts);
           System.out.println(ans);
    }
static int maximumwealth(int[][] arr){
    int max=0;
    for(int row = 0; row<arr.length; row++){
        int rowsum=0;
        for(int col  = 0 ; col<arr[row].length ; col++){
            rowsum+= arr[row][col];
        }
        if(rowsum>max){
            max=rowsum;
        }
        
    }

  return max;}
}
