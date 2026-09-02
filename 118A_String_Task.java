import java.util.Scanner;
 
public class AStringTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String[] letters = input.replaceAll("\\s+", "").split("");
        String[] exclude = {"a", "e", "i", "o", "u","y"};
        for(String x: letters) {
            boolean isVowel = false;
            for(String y: exclude) {
                if(x.equalsIgnoreCase(y)) {
                    isVowel = true;
                }
            }
            if(!isVowel) {
                System.out.print("." + x.toLowerCase());
            }
        }   
    }
}