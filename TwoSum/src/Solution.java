import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] == target - nums[i]) {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");

        /*
        An IllegalArgumentException is thrown in order to indicate that a method has been passed an illegal argument.

        Reasons for java.lang.IllegalArgumentException:
        1. When Arguments out of range. For example, the percentage should lie between 1 to 100. If the user entered 101 then an IllegalArugmentExcpetion will be thrown.
        2. When argument format is invalid. For example, if our method requires date format like YYYY/MM/DD but if the user is passing YYYY-MM-DD. Then our method can’t understand then IllegalArugmentExcpetion will be thrown.
        3. When a method needs non-empty string as a parameter but the null string is passed.
         */
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] testArray = {1,2,3,4};
        System.out.println(Arrays.toString(test.twoSum(testArray, 3)));
    }
}
