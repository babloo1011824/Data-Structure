import java.util.*;

public class rotate {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        int temp=n;
        while(temp>0){
            n=n/10;
            count++;
        }
        k=k%count;
        if(k<0){
            k=k+count;
        }
        int pow=(int)Math.pow(10,k);
        int a=n/pow;
        int b=n%pow;
        int shift=(int)Math.pow(10,count-k);
        int ans=b*shift+a;
        System.out.println(ans);
    }
    
}
