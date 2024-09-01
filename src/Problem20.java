import java.util.Scanner;
public class Problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        if (arr.length == 1){
            System.out.println(0);
            System.exit(0);
        }
        if (arr[0] >= arr[1]){
            System.out.println(0);
        }
        else if (arr[n - 1] >= arr[n - 2]) {
            System.out.println(n - 1);
        }
        else {
            for (int i = 1; i < arr.length - 1; i++){
                if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
