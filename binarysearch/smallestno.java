public class smallestno {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'd', 'f'};
        char target = 'd';

        char ans = binarysearch(letters, target);
        System.out.println(ans);
    }

    static char binarysearch(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1; // handles both > and ==
            }
        }

        // wrap-around case
        return letters[start % letters.length];
    }
}  




// Let’s do a step-by-step dry run of your code for:

// arr = {'a', 'b', 'c', 'd', 'f'}
// target = 'd'
// 🔁 Initial Values
// start = 0
// end = 4
// ▶️ Iteration 1
// mid = 0 + (4 - 0) / 2 = 2
// arr[mid] = 'c'

// Check:

// target ('d') < 'c' ❌
// else → start = mid + 1 = 3

// 👉 Updated:

// start = 3
// end = 4
// ▶️ Iteration 2
// mid = 3 + (4 - 3) / 2 = 3
// arr[mid] = 'd'

// Check:

// target ('d') < 'd' ❌
// else → start = mid + 1 = 4

// 👉 Updated:

// start = 4
// end = 4
// ▶️ Iteration 3
// mid = 4 + (4 - 4) / 2 = 4
// arr[mid] = 'f'

// Check:

// target ('d') < 'f' ✅
// → end = mid - 1 = 3

// 👉 Updated:

// start = 4
// end = 3
// ⛔ Loop Ends

// Condition fails:

// start (4) > end (3)
// 🔚 Final Step
// return arr[start % arr.length];
// start = 4
// arr.length = 5

// 4 % 5 = 4
// → arr[4] = 'f'
// ✅ Final Output
// f
// 💡 Key Insight
// The algorithm finds the smallest character strictly greater than target
// For 'd', the next greater character is 'f'

// If you try:

// target = 'f'

// 👉 Output will be 'a' (wrap-around case)