package Day3;

public class maxSub {
    public static void main(String[] args) {
        //brute force
        int arr[]= {7, -8, 4, 7, -9};

        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];

                if(max < sum)max=sum;
            }
        }
        System.out.println(max);
    }
}
