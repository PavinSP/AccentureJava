import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int max = 0;
        for (int i = 1; i <= n - k + 1; i++){
            int current = 0;
            for (int j = 1; j < k + 1; j++){
                current += (j * arr[i + j - 2]);
            }
            if (current > max){
                max = current;
            }
        }
        System.out.println(max);
    }
}