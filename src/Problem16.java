import java.util.Scanner;
public class Problem16{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int num1 = a;
        int num2 = b;
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        int lcm = (num1 * num2 / gcd);
        System.out.println(gcd);
        System.out.println(lcm);
    }
}