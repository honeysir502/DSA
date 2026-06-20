public class celling {
    // smallest number gretaer than or equal to the traget number present in array
    public static void main(String[] args) {
        int[] arr = { -12, -10, -5, 0, 3, 5, 7, 9, 12, 15 };
        int target = 10;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr [mid] ;
            }
        }
      
       return arr[start];
    }
}
