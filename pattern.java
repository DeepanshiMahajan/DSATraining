public class pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //space
            for(int j= 1;j <=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int star = 1; star<=i;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


  