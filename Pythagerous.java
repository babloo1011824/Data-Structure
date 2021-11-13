import java.util.*;

public class Pythagerous {
  public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      boolean isPT=false;
      if(a*a==b*b+c*c){
          isPT=true;

      }else if(b*b==a*a+c*c){
            isPT=true;
      }else if(c*c==a*a+b*b){
          isPT=true;
      }

      System.out.println(isPT);
  }  
}
