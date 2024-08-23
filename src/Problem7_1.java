import java.util.*;
public class Problem7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
                if (vowels.contains(str.charAt(i))) {
                    map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
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