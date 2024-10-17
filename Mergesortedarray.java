
import java.util.Arrays;


public class Mergesortedarray {
    public static void main(String args[]){
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3;
        int n=3;
        System.out.println(Arrays.toString(merge(nums1,nums2,m,n)));
    }
public static int[] merge(int[] nums1,int[] nums2,int m,int n){
    int i=m-1;//nums1 last index 
    int j=n-1;//last index of nums2
    int k=m+n-1;//last index of nums1 
    while(j>=0){
        if(nums1[i]>nums2[j]){
            nums1[k]=nums1[i];
            k--;
            i--;
        }
        else{
            nums1[k]=nums2[j];
            k--;
            j--;
            }
}
    return nums1;
}
}

