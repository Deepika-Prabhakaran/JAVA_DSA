
import java.util.Arrays;


public class reversearray {
    public static void main(String args[]){
        int[] nums={1,2,3,4,5};
        System.out.println(Arrays.toString(search(nums)));
    }
    public static int[] search(int[] nums){
        for(int i=0;i<nums.length-1/2;i++){
        int temp=nums[i];
        nums[i]=nums[nums.length-1-i];
        nums[nums.length-1-i]=nums[i];
        
    }
//        int i=0;
//        int j=nums.length-1;
//        while(i<j){
//        int temp=nums[i];
//        nums[i]=nums[j];
//        nums[j]=temp;
//        i++;
//        j--;
//        }
        return nums;
}
}
