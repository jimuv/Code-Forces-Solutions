import java.util.*;
public class thes{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();
        long test1 = ((long)(n+a-1)/a)*((long)(m+a-1)/a);
        System.out.print(test1);
    }
}