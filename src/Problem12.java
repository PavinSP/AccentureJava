import java.util.Scanner;
public class Problem12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = n;
        while (true){
            if (isPrime(i) && i > n){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
    public static boolean isPrime(int n){
        boolean prime = true;
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return prime;
    }
}
