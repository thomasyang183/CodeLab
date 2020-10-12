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

    public int[] rotateArray (int[] nums, int k) {

        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        return nums;
    }

    public void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] num = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(test.rotateArray(num,2)));
    }
}