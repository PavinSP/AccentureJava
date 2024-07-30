import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int max_score = 0;
        for (int i = 0; i <= n-k; i++){
            int current_score = 0;
            for (int j = 1; j < k+1; j++){
                current_score += j * arr[i+j-1];
            }
            max_score = Math.max(current_score, max_score);
        }
        System.out.println(max_score);
    }
}