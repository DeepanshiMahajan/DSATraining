package Day3;

public class maxArray {

    public static void main(String[] args) {
        int arr[] = {0, 1, 5, 1, 3};

        int max =arr[0];

        for(int i=1; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);
    }
}
