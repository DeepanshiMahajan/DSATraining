public class pattern3 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = 2 * n - 3;

        while (row <= n) {

            // Left stars
            for (int star1 = 1; star1 <= row; star1++) {
                System.out.print("*");
            }

            // Spaces
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }

            // Right stars
            for (int star2 = 1; star2 <= row; star2++) {
                if (row == n && star2 == 1) {
                    continue;   // avoid extra star in last row
                }
                System.out.print("*");
            }

            System.out.println();

            space -= 2;
            row++;
        }
    }
}