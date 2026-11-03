class Solution {
    public int solution(String num_str) {
        int len = num_str.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += num_str.charAt(i) - '0';
        }
        return sum;
    }
}