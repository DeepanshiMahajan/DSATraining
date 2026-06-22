import java.util.*;

public class primeNo {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean t = true;

        if (n <= 1) {
            t = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    t = false;
                    break;
                }
            }
        }

        if (t) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}