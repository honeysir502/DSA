
import java.util.Arrays;
public class maxin2darray {
    


    public static void main(String[] args) {
        int nums [][]  = {
            {1,2,3} ,
            {4,5,6,7},
            {67,78,89,9}
        };
        
        int max = search(nums);
        System.out.println((max));

    }
    static int  search(int arr[][] ){
              int max =   arr [0][0];
            for (int[] element : arr) {
                  for (int element2 : element) {
                    if(element2 > max){
                        
                  max =  element2;
                   
                    }
                  }
            }
    return max;

}



}
