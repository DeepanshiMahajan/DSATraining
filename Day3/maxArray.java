package Day3;

public class maxArray {

    public static void main(String[] args) {
        int arr[] = {0, 1, 5, 1, 3};

        int maxOfArr = 0;

        for (int i = 0; i < arr.length; i++) {
            maxOfArr = Math.max(maxOfArr,arr[i]);
        }

        System.out.println(maxOfArr);
    }
}
