package Day3;

public class minArray {

    public static void main(String[] args) {
        int arr[] = {-5, -1, -2, -7, -3};

        int min = 0;

        for(int i=0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }

        System.out.println(min);
    }
}
