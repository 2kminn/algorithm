class Solution {
    public int solution(int n) {
        int sum = 0;
        if (isodd(n)) {
            for (int i = 1; i <= n; i+=2) {
                sum += i;
            }
        }
        else if(!isodd(n) && n > 1){
            for (int i = 2; i <= n; i+=2) {
                sum += i * i;
            }
        }
        return sum;
    }
    
    private boolean isodd(int n) {
        return n % 2 == 1;
    }
}