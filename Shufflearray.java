
import java.util.Arrays;


public class Shufflearray {
   public static void main(String args[]) {
       int[] nums={1,3,5,2,4,6};
       int n=3;
       System.out.println(Arrays.toString(shuffle(nums,n)));
   }
   public static int[] shuffle(int[] nums,int n){
       int[] ans=new int[2*n];
       int count=0;
       for(int i=0;i<n;i++){
       ans[count]=nums[i];
       ans[count+1]=nums[i+n];
       count+=2;
       
           
   }
     return ans;
}
 
}
