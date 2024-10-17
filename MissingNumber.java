

//268.MissingNumber leetcode
public class MissingNumber {
    public static void main(String args[]){
    int[] arr={9,6,4,2,3,5,7,0,1};
    int n=arr.length;
    int sum_no=sumofnumber(arr);
    int missing_no=missingNumber(arr,sum_no,n);
    System.out.println(missing_no);
    }
    
    static int missingNumber(int[] arr,int sum_no,int n){
     int sum_expected=n*(n+1)/2;
     return sum_expected-sum_no;
    }
    static int sumofnumber(int[] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum +=arr[i];   
    }
    return sum;
    }    
}
////simple 0ms solution
////import java.util.Arrays;
////public class MissingNumber{
//public static void main(String args[]){
// int[] arr={4,0,2,1};  
//int missingNumber1=missingNumber(arr) ;
//System.out.println(missingNumber1);
//}
//static int missingNumber(int[] nums) {
//        int total = (nums.length*(nums.length+1))/2;
//        int numsTotal = 0;
//        for (int num : nums) numsTotal += num;
//        return total - numsTotal;
//    }
//}
