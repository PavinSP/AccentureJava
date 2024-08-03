import java.util.Scanner;
public class Problem21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans = 0;
        int pos = 0;
        for (int i = 0; i < n; i++) {
            pos += arr[i];
            ans = Math.max(ans, Math.abs(pos));
        }
        System.out.println(ans);
    }
}
