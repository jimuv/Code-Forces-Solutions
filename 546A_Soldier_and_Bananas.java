import java.util.*;
public class ASoldierAndBananas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        for(int i=0;i<w;i++){
            n-=k*(i+1);
        }
        if(n<0){
            System.out.println(-n);
        }
            else{
                System.out.println(0);
            }
    }
}