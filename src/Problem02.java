import java.util.Scanner;
class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        int sum = 0; // current position of ant be 0
        for (int i = 1; i <= arr.length; i++){
            sum += arr[i-1];
            if (sum == 0) count++;
        }
        System.out.println(count);
    }
}