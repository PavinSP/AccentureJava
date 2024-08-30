import java.util.Scanner;
public class Problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        int left = 0;
        int right = sum - arr[0];
        for (int i = 1; i < arr.length; i++){
            left += arr[i-1];
            right -= arr[i];
            if (left == right){
                System.out.println(i+1);
                System.exit(0);
            }
        }
        System.out.println("NOT FOUND");
    }
}
