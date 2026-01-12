class Solution {
    public int solution(int a, int b) {
        int n1 = Integer.parseInt("" + a + b);
        int n2 = a * b * 2;
        
        if (n1 == n2)
            return n1;
        else
            return Math.max(n1, n2);
    }
}