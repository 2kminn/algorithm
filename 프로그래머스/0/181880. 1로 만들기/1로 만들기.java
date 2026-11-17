class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            int temp = num_list[i];
            while (temp != 1) {
                if(temp % 2 == 0) {
                    temp /= 2;
                    count++;
                }
                else if (temp > 1 && temp % 2 == 1) {
                    temp -= 1;
                    temp /= 2;
                    count++;
                }
            }
        }
        return count;
    }
}