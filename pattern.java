public class pattern {
    public static void main(String[] args) {
        int n=5;
        for(int lines=1; lines<=n; lines++){
            //space
            for(int space= 1; space<=n-lines; space++){
                System.out.print(" ");
            }
            //star
            for(int star = 1; star<=lines;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


  