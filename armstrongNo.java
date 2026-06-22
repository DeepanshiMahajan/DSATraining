import java.util.Scanner;

public class armstrongNo {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Number :");
      int n = sc.nextInt();

      int sum =0;
      int temp =n;

      while(n > 0){
        int digit = n%10;
        sum+= Math.pow(digit, 3);
        n = n/10;
      }
      if(sum == temp){
        System.out.println("Armstrong no");
      }else{
        System.out.println("Not a Armstrong No");
      }
    }
}