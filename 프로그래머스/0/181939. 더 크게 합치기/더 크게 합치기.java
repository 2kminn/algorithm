class Solution {
    public int solution(int a, int b) {
        String s1 = new StringBuilder().append(a).append(b).toString();
        String s2 = new StringBuilder().append(b).append(a).toString();
        
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        return Math.max(n1, n2);
    }
}