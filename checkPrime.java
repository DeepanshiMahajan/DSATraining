public class checkPrime {
    public static void main(String[] args) {

        for (int j = 2; j <= 1000; j++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(j);
            }
        }
    }
}