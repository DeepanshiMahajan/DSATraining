package Day3;

public class secLargest {
    public static void main(String[] args) {
        int n = 96752;
        int firstLar = -1;
        int secLargest = -1;

        while(n > 0){
           int ld = n%10;
           if(ld > firstLar){
            secLargest = firstLar;
            firstLar = ld;
           } else if(ld> secLargest){
            secLargest=ld;
           }
            n /= 10;
        }

        System.out.println(secLargest);
    }
}
