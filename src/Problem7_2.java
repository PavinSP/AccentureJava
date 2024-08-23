import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Problem7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String str = scanner.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            for (Character ch : vowels) {
                if (ch == str.charAt(i)) {
                    map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
                }
            }
        }
        int max = 0;
        Character max_element = null;
        Set<Map.Entry<Character, Integer>> values = map.entrySet();
        for (Map.Entry<Character, Integer> i : values){
            if (i.getValue() > max){
                max = i.getValue();
                max_element = i.getKey();
            }
        }
        System.out.println(max_element);
    }
}