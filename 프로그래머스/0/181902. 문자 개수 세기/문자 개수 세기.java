class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            int temp = my_string.charAt(i);
            if (temp - 65 >= 0 && temp - 65 < 26) {
                answer[temp - 65]++;
            }
            else {
                answer[temp - 97 + 26]++;
            }
        }
        return answer;
    }
}