
import java.util.Arrays;


public class runningsum {
    public static void main(String args[]){
        int[] nums={3,1,2,10,1};
        System.out.println(Arrays.toString(RunningSum(nums)));
    }
    public static int[] RunningSum(int[] nums){
    int sum=0;
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        nums[i]=sum;
    }
    return nums;
    }
}
