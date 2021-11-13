import java.util.Scanner;
public class primeFactori {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int div=2;
        while(div*div<=n){
            if(n%div==0){
                System.out.println(div);
                n=n/div;
            }else{
                div++;
            }
        }
        System.out.println(n);
    }
    
}
