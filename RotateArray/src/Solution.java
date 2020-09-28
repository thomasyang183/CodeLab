import java.util.Arrays;

public class Solution {
    /*
    result:
    corner case: k == 0
    1. an array which has the same length as the input array, and elements moved from rightmost to left
    2. need to use a for loop
    3. copy from the input array, and simultaneously paste it on the new array
    4. start copying from array.length - k, paste it as index = 1 on the new array
    index < array.length
    5. array.length - k + 1, ~ index = 1 + 1
    6. array.length - k + 1 + 1, ~ index == 1 + 1 + 1
    index >= array.length
    7. new array index[k] = array[0]
    8...
     */

    public int[] rotateArray (int[] input, int k) {

        int[] res = new int[input.length];

        // copy from array.length - k, to the rightmost element in the array
        for (int i = 0; i < k; i++) {
            res[i] = input[input.length - k + i];
        }

        // once that is complete, start from the index 0 of the input array
        for (int j = 0; j < input.length - k; j++){
            res[k+j] = input[j];
        }

        return res;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] num = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(test.rotateArray(num,2)));
    }
}