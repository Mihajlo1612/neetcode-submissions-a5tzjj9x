class Solution {
    public static int numOfDigits(long number) {

        int brojac = 0;
        while (number != 0) {
            number /= 10;
            brojac++;
        }
        return brojac;
    }
    public int[] plusOne(int[] digits) {

        long number = 0;
        for (int i = 0; i < digits.length; i++) {
            number = number * 10 + digits[i];
        }
        number += 1;

        int len = numOfDigits(number);
        int[] solution = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            solution[i] = (int)(number % 10);
            number /= 10;
        }
        return solution;
    }
}
