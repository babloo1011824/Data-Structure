import java.util.*;

public class gcd1 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int gcd=0;
        int divisor=n1;
        int dividend=n2;
        while(dividend%divisor!=0){
            int rem=dividend%divisor;
            dividend=divisor;
            divisor=rem;
        }
                 gcd=divisor;
       // System.out.println(divisor);



        int lcm=(n1*n2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }



    
    
}
