import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Set<Character> alpha = new HashSet<>();
        for (char i= 'a'; i <= 'z'; i++){
            alpha.add(i);
        }
        for (int i = 0; i < str.length(); i++){
            alpha.remove(str.charAt(i));
        }
        for (char ch : alpha){
            System.out.print(ch);
        }
    }
}