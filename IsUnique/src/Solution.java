public class Solution {
    boolean isUnique (String input) {
        for (int i = 0; i < input.length() - 1; i++) {
            for (int j = i + 1; j < input.length() - 1; j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    return false; //not unique
                }
            }
        }
        return true;
    }

    public static void main (String[] Args) {
        Solution test = new Solution();
        System.out.println(test.isUnique("abcd10jk"));
    }

}
