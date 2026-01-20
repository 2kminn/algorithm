class Solution {
    public int solution(int[] num_list) {
        int len1 = num_list.length;
        int sum = 0;
        int multiply = 1;
        int result = 0;
        
        for (int i = 0; i < len1; i++) {
            sum += num_list[i];
            multiply *= num_list[i];
        }

        return (multiply < sum * sum) ? 1 : 0;
    }
}