import java.util.Scanner;
public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = "";
        while (n > 0){
            result = (int) Math.pow(n%10, 2) + result;
            n /= 10;
        }
        long ans = Long.parseLong(result);
        System.out.println(ans);
    }
}
