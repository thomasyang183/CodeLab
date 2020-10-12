public class Solution {
    public boolean checkInclusion (String s1, String s2) {
        int[] map = new int[26];
        int sum = s1.length();

        // construct frequency map
        for (int i = 0; i < s1.length(); i++) {
            map[s1.charAt(i) - 'a']++;
        }

        for (int r = 0, l = 0; r < s2.length(); r++) {
            char c = s2.charAt(r);
            if (map[c - 'a'] > 0) {
                map[c - 'a']--;
                sum--;
                //check for permutation match
                if (sum == 0) return true;
            } else {
                // if there is enough number for char c or c is never seen before
                // we move left pointer next to the position where first saw char c
                // or to the r+1 (we never see char before),
                // and during this process we restore the map.
                while (l <= r && s2.charAt(l) != s2.charAt(r)) {
                    map[s2.charAt(l) - 'a']++;
                    l++;
                    sum++;
                }
                l++;
            }
        }
        return false;
    }
}
