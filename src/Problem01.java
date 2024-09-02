import java.util.Scanner;
public class Problem01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // no of elements in an array (no of shots made)
        int k = scanner.nextInt(); // size of the contiguous sub array
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int max_score = 0;
        for (int i = 1; i <= n-k + 1; i++){ // n - k + 1 (no of possible sub arrays, ex: [1, 2, 3, 4, 5] and k = 2, so possible sub arrays are [1, 2], [2, 3], [3, 4], [4, 5]
            int current_score = 0; // score for each sub array
            for (int j = 1; j < k+1; j++){
                current_score += j * arr[i+j-2];
            }
            max_score = Math.max(current_score, max_score); // max score updated
        }
        System.out.println(max_score);
    }
}