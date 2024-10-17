
import java.util.Arrays;


public class plusone {
    public static void main(String args[]){
        int[] digits={1,9};
        System.out.println(Arrays.toString(Plusone(digits)));
    }
    public static int[] Plusone(int[] digits){
//            int i=digits.length-1;
//            digits[i]=digits[i]+1;   
//        return digits;
    for(int i=digits.length-1;i>=0;i--){
        if(digits[i]+1<10){
            digits[i]++;
            return digits;
        }
        else{
            digits[i]=0;
        }
    }
    digits=new int[digits.length+1];
    digits[0]=1;
    return digits;
}
    
    
    
}
