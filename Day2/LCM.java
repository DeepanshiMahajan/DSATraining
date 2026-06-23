public class LCM {
    public static void main(String[] args) {
        int a = 12, b = 40;
        int hcf = 1;

        // Find HCF
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        //LCM
        int lcm = (a * b) /hcf ;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
}