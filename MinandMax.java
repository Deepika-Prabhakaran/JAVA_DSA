
import java.util.Arrays;


public class MinandMax {
    public static void main(String args[]){
        int[] nums={1,423,6,46,34,23,13,53,4};
        Arrays.sort(nums);
        System.out.println("minimum :"+nums[0]+" maximum :"+nums[nums.length-1]);
    }
}
