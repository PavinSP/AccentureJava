import java.util.Scanner;
public class Problem03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int acount = 0;
        for (int i = 0; i < n; i++){
            while (arr[i] > 0){
                if (arr[i] >= 3){
                    acount += 1;
                    arr[i] -= 3;
                }
                else if (arr[i] >= 2){
                    acount += 1;
                    arr[i] -= 2;
                }
                else if (arr[i] >= 1){
                    acount += 1;
                    arr[i] -= 1;
                }
            }
        }
        System.out.println(acount);
    }
}
