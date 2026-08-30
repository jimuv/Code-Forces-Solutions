import java.util.*;
public class dp{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tries = scan.nextInt();
        for(int i=0;i<tries;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int moves = (b-(a%b)%b);
            if(a%b==0){
                moves=0;
            }
            System.out.println(moves);
    }
}
}