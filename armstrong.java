
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sneha
 */
public class armstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        //int n=sc.nextInt();
        for(int i=100;i<1000;i++){
            if(armstrong(i))
                System.out.print(i+" ");
                
            
        }
       //System.out.println(armstrong(n));
    }
        static boolean armstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        return (original==sum);
    }
    
}
