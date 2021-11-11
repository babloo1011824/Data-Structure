import java.util.*;
class isPrime{
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);   
     
        int n=sc.nextInt();
        if(n>=1){
            System.out.println("not prime");
        }
       
        boolean flag=true;
    
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("prime");
        }
        else{
            System.out.println("not primre");
        }

    }
}
