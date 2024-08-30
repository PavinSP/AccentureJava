import java.util.HashMap;
import java.util.Scanner;
public class Problem18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            int difference = target - arr[i];
            if (map.containsKey(difference)){
                System.out.print("[" + map.get(difference) + ", " + i + "]");
                System.exit(0);
            }
            map.put(arr[i], i);
        }
    }
}
