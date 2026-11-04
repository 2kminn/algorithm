class Solution {
    public String solution(String n_str) {
        int temp = 0;
        for (int i = 0; i < n_str.length(); i++) {
            boolean b = true;
            if (n_str.charAt(i) == '0') {
                b = false;
            }
            
            if (b) {
                temp = i;
                break;
            }
            
        }
        return n_str.substring(temp);
    }
}