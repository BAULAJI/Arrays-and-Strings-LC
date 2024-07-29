import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        
        Arrays.sort(strs);
        int n = strs.length;
        String st = "";
        
    
        for (int i = 0; i < strs[0].length() && i < strs[n-1].length(); i++) {
            if (strs[0].charAt(i) != strs[n-1].charAt(i)) {
                break;
            } else {
                st += strs[0].charAt(i);
            }
        }
        
        return st;
    }
}
