import java.util.Scanner;
public class Problem21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int current = arr[0];
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++){
            current = Math.max(arr[i], current + arr[i]);
            if (current > answer){
                answer = current;
            }
        }
        System.out.println(answer);
    }
}
