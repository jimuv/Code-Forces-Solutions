import java.util.*;
public class BDrinks {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double res=0;
        for (int i=0;i<n;i++){
            int x = sc.nextInt();
            res+=(double)x/100;
        }
        double res2=res/n*100;
        System.out.printf("%.12f%n", res2);
    }
}