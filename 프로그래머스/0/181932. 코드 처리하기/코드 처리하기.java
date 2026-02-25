class Solution {
    public String solution(String code) {
        boolean mode = false;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') {
                mode = !mode;
                continue;
            }
            if (mode) {
               if (i % 2 == 1) {
                   sb.append(c);
               }
            }
            else {
                if (i % 2 == 0) {
                    sb.append(c);
                }  
            }
        }
        String answer = sb.toString();
        return answer.isEmpty() ? "EMPTY" : answer;
    }
}