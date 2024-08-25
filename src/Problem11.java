import java.util.Arrays;
import java.util.Scanner;
public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        float avg = (float) (arr[n - 1] + arr[n - 2]) / 2;
        int sum = 0;
        for (int i : arr){
            if (i < avg){
                i = 0;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}