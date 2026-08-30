import java.util.*;
public class AEvenOdds {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(k<=(n+1)/2){
            System.out.print(2*k-1);
        }
        else{
            k-=((n+1)/2);
            System.out.print(2*k);
        }
        
    }
}