import java.util.Arrays;
import java.util.Scanner;
public class Problem10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int product = scanner.nextInt();
        Arrays.sort(arr);
        int count = 0;
        int i = 0, j, k;
        while (i < n - 2){
            j = i + 1;
            k = n - 1;
            while (j < k){
                int new_prod = arr[i] * arr[j] * arr[k];
                if (product == new_prod){
                    count++;
                    j++;
                    k--;
                }
                else if (product < new_prod) {
                    k--;
                }
                else{
                    j++;
                }
            }
            i++;
        }
        System.out.println(count);
    }
}