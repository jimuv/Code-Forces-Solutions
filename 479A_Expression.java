import java.util.*;
public class AExpression{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
 
        int ans=a+b+c;
 
        if(a*b*c>ans){
            ans=a*b*c;
        }
        if((a+b)*c>ans){
            ans=(a+b)*c;
        }
        if(a*(b+c)>ans){
            ans=a*(b+c);
        }
 
        System.out.print(ans);
    }
}