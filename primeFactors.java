public class primeFactors {
    public static void main(String[] args) {
        int n =150;
        for(int i=2; i<=n; i++){
            while(n % i == 0){
                System.out.println(i+ " ");
                 n = n/i;
            }
        }
    }
}
