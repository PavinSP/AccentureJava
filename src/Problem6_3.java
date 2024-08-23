import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Problem6_3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int nums : arr){
            map.put(nums, map.getOrDefault(nums, 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> values = map.entrySet();
        int max = 0;
        int maxElement = -1;
        boolean isTie = false;
        for (Map.Entry<Integer, Integer> i : values){
            if (i.getValue() > max){
                max = i.getValue();
                maxElement = i.getKey();
                isTie = false;
            }
            else if (i.getValue() == max){
                isTie = true;

            }
        }
        if (isTie){
            System.out.println(-1);
        }
        else{
            System.out.println(maxElement);
        }
    }
}