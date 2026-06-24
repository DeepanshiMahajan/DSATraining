package Day3;

public class maxFreqNo {
    public static void main(String[] args) {
        int[] nums = { 6, 1, 3, 1, 2, 1, 1, 3 };
        int maxFreq  =0;
        int ans =-1;

        for(int i=0;i<nums.length;i++){
            int count =1;
            for(int j= i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if( count > maxFreq){
                maxFreq = count;
                ans = nums[i];
            }
        }
        System.out.println(ans+" : "+maxFreq);
        }
    }