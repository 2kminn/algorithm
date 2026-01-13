class Solution {
    public int solution(int num, int n) {
        int temp = num % n;
        
        if (temp == 0)
            return 1;
        else
            return 0;
    }
}