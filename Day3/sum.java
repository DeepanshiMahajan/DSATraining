package Day3;

public class sum {
    public static void main(String[] args) {
        int arr[] = {0, 1, 5, 1, 3};

        int sumOfArr = 0;

        for (int i = 0; i < arr.length; i++) {
            sumOfArr += arr[i];
        }

        System.out.println(sumOfArr);
    }
}