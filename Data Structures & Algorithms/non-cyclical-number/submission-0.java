class Solution {
    public static int powerUp(int n) {

        int number = 0;
        int sum = 0;

        while (n != 0) {
            number = n % 10;
            sum += number * number;
            n /= 10;
        }
         return sum;
    }

    public static boolean isHappy(int n) {
        List<Integer> list = new ArrayList<>();

        if (n < 1 || n > 1000) {
            System.out.println("Input must be > 1 and < 1000");
            return false;
        }

        if (powerUp(n) == 1) return true;

        while (n != 1) {
            n = powerUp(n);
            if (list.contains(n)) {
                return false;
            } else {
                System.out.println(n);
                list.add(n);
            }
        }
        return true;
    }
}
