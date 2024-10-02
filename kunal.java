//
import java.util.Scanner;
//
////prime number or not 
//public class kunal {
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(isprime(n));
//    }
//static boolean isprime(int n){
//    int c=2;
//    if (n<=1)
//        System.out.println("neither prime nor composite");
//    while(c*c<=n){
//        if(n%c==0){
//            return false;
//        }
//        c++;
//    }  
//    return c*c>n;
//}   
//}

//armstrong number
public class kunal{
    public static void main(String args[]){
        //Scanner sc=new Scanner (System.in);
        // int n = sc.nextInt();
        for(int i=100;i<1000;i++){
            if(armstrong(i))
            System.out.println(i+"");
        }
       // sc.close();
    }
    
    static boolean armstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;   
            
        }
     return (original==n);      
    }
}


