import java.util.*;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        if (arr.length == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum_prime_factors(num, arr));
        }
    }
    public static int sum_prime_factors(int nums, int[] arr){
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 2; i <= nums; i++){
            while (nums % i == 0 && isPrime(i)){
                    map.put(i, map.getOrDefault(i, 0) + 1);
                    nums /= i;
                }
            }
        Set<Map.Entry<Integer, Integer>> values = map.entrySet();
        int sum = 0;
        for (Map.Entry<Integer, Integer> i : values){
            if (i.getKey() < 0 || i.getKey() >= arr.length) return 0;
            sum += (i.getValue() * arr[i.getKey()]);
        }
        return sum;
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}