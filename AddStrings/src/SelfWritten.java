public class SelfWritten {
    public String AddString (String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int pointer = 0;
        int len1 = num1.length();
        int len2 = num2.length();

        while (pointer <= len1 -1 || pointer <= len2 -1) {
            int x1 = pointer <= len1 - 1? num1.charAt(pointer) - '0' : 0;
            int x2 = pointer <= len2 - 1? num2.charAt(pointer) - '0' : 0;
            res.append((x1 + x2 + carry) % 10); //don't forget to add carry
            carry = (x1 + x2 + carry) / 10;
            pointer++;
        }
        if (carry != 0) { //don't add any leading zero
            res.append(carry);
        }
        return res.reverse().toString();
    }

    public static void main(String args[]) {
        SelfWritten test = new SelfWritten();
        System.out.println(test.AddString("111", "9"));
    }

    /*
    Let's do some brainstorming. We are inputting two Strings, and you are doing digit-by-digit additions.
    we should have the following parts:
    0. corner cases
    1X. new var - result string: res
    2. steps: sum % 10 append to res, sum / 10 goes to carry
    3. new var - carry
    4. new var - pointer from right
    5. need to consider conditions where one of the number is out of digit
    6. steps: need to reverse res
    7. return string

     */
}
