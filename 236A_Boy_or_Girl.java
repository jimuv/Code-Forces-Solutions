import java.util.*;
public class hi{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        boolean girl=false;
        ArrayList<Character> charlist = new ArrayList<Character>();
        for (char c:input.toCharArray()){
            if (!charlist.contains(c)){
                charlist.add(c);
            }
        }
 
        if (charlist.size()%2==0) {
            System.out.print("CHAT WITH HER!");
        } else {
            System.out.print("IGNORE HIM!");
        }
    }
}