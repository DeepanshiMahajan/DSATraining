public class bostonNo {

    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 378;
        int temp = n;

        int sumDigits = digitSum(n);
        int sumFactors = 0;

        for (int i = 2; i <= temp; i++) {
            while (temp % i == 0) {
                sumFactors += digitSum(i);
                temp /= i;
            }
        }

        if (sumDigits == sumFactors) {
            System.out.println(n + " is a Boston Number");
        } else {
            System.out.println(n + " is not a Boston Number");
        }
    }
}