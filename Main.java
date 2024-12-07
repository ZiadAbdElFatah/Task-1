class Solution {
    public String combineWords(String a, String b) {
        int i, j;
        i = j = 0;
        StringBuilder ans = new StringBuilder();
        while (i < a.length() || j < b.length()) {
            if (i < a.length()) {
                ans.append(a.charAt(i));
                i++;
            }
            if (j < b.length()) {
                ans.append(b.charAt(j));
                j++;
            }
        }
        return ans.toString();
    }
}
public class Main {
    public static void main(String[] args) {
    }
}