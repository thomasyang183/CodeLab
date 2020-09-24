public class Solution {
    /*
     *  "123" + "24" = "147"
     */
    public String addStrings (String num1, String num2) {
        StringBuilder res = new StringBuilder();

        int carry = 0;
        int p1 = num1.length() - 1; //set pointer to loop thru a string from right to left
        int p2 = num2.length() - 1;
        while (p1 >= 0 || p2 >= 0) {
            //use ternary operator
            //set x1 or x2 to be 0, when either one has p1/p2 < 0
            int x1 = p1 >= 0 ? num1.charAt(p1) - '0': 0; // turn ASCII to actual number
            int x2 = p2 >= 0 ? num2.charAt(p2) - '0': 0;

            int value = (x1 + x2 + carry) % 10;
            carry = (x1 + x2 + carry) / 10;
            res.append(value);
            p1--;
            p2--;
        }
        if (carry != 0) {
            res.append(carry);
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.addStrings("100", "99"));
    }
}
