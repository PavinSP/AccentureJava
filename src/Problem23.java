import java.util.Scanner;
public class Problem23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a = scanner.nextInt();
        int lastChild = ((a + (k - 1) - 1) % n) + 1;
        System.out.println(lastChild);
    }
}