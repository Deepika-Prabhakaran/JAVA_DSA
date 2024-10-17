
public class removeduplicate {
    public static void main(String args[]){
        int[] nums={1,1,2};
        System.out.println(removeDuplicate(nums));
    }
    public static int removeDuplicate(int[] nums){
        int current=0;
        for(int i=0;i<nums.length;i++){
        if(i<nums.length-1 && nums[i]==nums[i+1]){
         continue;
        }
        else{
            nums[current]=nums[i];
            current++;
        }
        
        }
        return current;
    }
}
