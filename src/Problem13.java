import java.util.HashMap;
import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        int max = 0;
        for (Character c : map.keySet()){
            if (map.get(c) > 0){
                max = map.get(c);
            }
        }
        System.out.println(str.length() - max);
    }
}
