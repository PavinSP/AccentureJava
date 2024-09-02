import java.util.Scanner;
public class Problem22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int pos = 0;
        int ans = 0;
        for (int i : arr) {
            pos += i;
            ans = Math.max(ans, Math.abs(pos));
        }
        System.out.println(ans);
    }
}