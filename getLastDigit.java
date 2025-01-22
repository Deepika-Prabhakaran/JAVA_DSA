/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    String a="4";
	    String b="100";
	    int res=getLastDigit(a,b);
	    System.out.println(res);
	}
    public static int getLastDigit(String a, String b) {
        // Get the last digit of a
        int lastdigit = (a.charAt(a.length() - 1)) - '0';
        
        // Handle the special case when b is "0"
        if (b.equals("0")) {
            return 1;
        }

        // Initialize the cycle array (max 4 cycles)
        int[] cycle = new int[4];
        cycle[0] = lastdigit;
        
        // Generate the cycle of last digits
        int cyclelen = 1;
        for (int i = 1; i < 4; i++) {
            cycle[i] = (cycle[i - 1] * lastdigit) % 10;
            if (cycle[0] == cycle[i]) {
                cyclelen = i;
                break;
            }
        }

        // Now calculate the effective power mod cycle length
        int effpow = 0;
        for (int i = 0; i < b.length(); i++) {
            effpow = (effpow * 10 + (b.charAt(i) - '0')) % cyclelen;
        }

        // Adjust effpow to be in the range [1, cyclelen] instead of [0, cyclelen-1]
        if (effpow == 0) {
            effpow = cyclelen;
        }

        return cycle[effpow-1 ];  // Subtract 1 because array is 0-based
    }


}
