class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] temp = new int[7];
        int[] dice = {a, b, c, d};

        int num1 = 0; // 4번 나온 숫자
        int num2 = 0; // 3번 나온 숫자
        int num3 = 0; // 2번 나온 숫자 1
        int num4 = 0; // 2번 나온 숫자 2
        int num5 = 0; // 1번 나온 숫자 1
        int num6 = 0; // 1번 나온 숫자 2

        boolean b1 = true;
        boolean b2 = true;

        for (int i = 0; i < 4; i++) {
            temp[dice[i]]++;
        }

        for (int i = 1; i < temp.length; i++) {

            if (temp[i] == 4) {
                num1 = i;
            }
            else if (temp[i] == 3) {
                num2 = i;
            }
            else if (temp[i] == 2 && b1) {
                num3 = i;
                b1 = false;
            }
            else if (temp[i] == 2) {
                num4 = i;
            }
            else if (temp[i] == 1 && b2) {
                num5 = i;
                b2 = false;
            }
            else if (temp[i] == 1) {
                num6 = i;
            }
        }

        if (num1 != 0) {
            return 1111 * num1;
        }

        if (num2 != 0) {
            return (10 * num2 + num5) * (10 * num2 + num5);
        }

        if (num3 != 0 && num4 != 0) {
            return (num3 + num4) * Math.abs(num3 - num4);
        }

        if (num3 != 0) {
            return num5 * num6;
        }

        return Math.min(Math.min(Math.min(a, b), c), d);
    }
}