class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        String hidden = "*".repeat(len - 4);
        return hidden + phone_number.substring(len - 4);
    }
}