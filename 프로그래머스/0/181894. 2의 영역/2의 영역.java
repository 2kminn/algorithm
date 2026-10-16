import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length - 1;
        int temp_start = -1;
        int temp_end = -1;

        for (int i = 0; i <= len; i++) {
            if (arr[i] == 2 && temp_start == -1) {
                temp_start = i;
            }

            if (arr[len - i] == 2 && temp_end == -1) {
                temp_end = len - i;
            }

            if (temp_start != -1 && temp_end != -1) {
                break;
            }
        }

        if (temp_start == -1) {
            return new int[]{-1};
        }

        return Arrays.copyOfRange(arr, temp_start, temp_end + 1);
    }
}