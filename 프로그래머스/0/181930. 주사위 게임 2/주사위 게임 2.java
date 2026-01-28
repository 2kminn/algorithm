class Solution {
    public int solution(int a, int b, int c) {
        int result = 0;
        int cal1 = a + b + c;
        int cal2 = cal1 * (a * a + b * b + c * c);
        int cal3 = cal2 * (a * a * a + b * b * b + c * c * c);
            
        if (a != b && b != c && c != a) {
            return cal1;
        }
        else if (a == b && b == c) {
            return cal3;
        }
        else
            return cal2;
    }
}