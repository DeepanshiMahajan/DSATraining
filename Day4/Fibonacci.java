package Day4;

public class Fibonacci {
    public static void main(String[] args) {
        int n =2;

        int a =0, b=1;
        for(int i=2;i<=n;i++){
            int c= a+b;
            a =b;
            b = c;
        }
        System.out.println(b);
    }
}
