import java.util.*;
public class digitOfnumber {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int count=0;
        int temp=n;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        int pow=(int)Math.pow(10,count-1);
        while(pow!=0){
            int div=n/pow;
    
            n=n%pow;
            System.out.println(div);
            pow=pow/10;
        
        }
        
    
    }
    

}
