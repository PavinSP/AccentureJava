import java.util.HashMap;
import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        int max_freq = 0;
        for (int i = 0; i < str.length(); i++){
            char current_char = str.charAt(i);
            int freq = map.getOrDefault(current_char, 0) + 1;
            map.put(current_char, freq);
            if (freq > max_freq){
                max_freq = freq;
            }
        }
        System.out.println(str.length() - max_freq);
    }
}
