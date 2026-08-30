import java.util.*;
 
public class AElephant {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int total = 0;
        int remainder = n;
 
        for (int i = 5; i >= 1; i--) {
            int count = remainder / i;
            total += count;
            remainder %= i;
        }
 
        System.out.println(total);
    }
}