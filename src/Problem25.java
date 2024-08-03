import java.util.Scanner;
public class Problem25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int p = scanner.nextInt() - 1;
        int k = scanner.nextInt();
        char result = 0;
        if (str.isEmpty()){
            System.out.println();
        }
        else{
            while (k > 0){
                if (p > 0 && p < str.length() - 1){
                    if (str.charAt(p - 1) < str.charAt(p + 1)) {
                        result = str.charAt(p - 1);
                        p--;
                    }
                    else {
                        result = str.charAt(p + 1);
                        p++;
                    }
                    k--;
                }
                else if (p == 0){
                    p++;
                }
                else if (p == str.length() - 1){
                    p--;
                }
            }
        }
        System.out.println(result);
    }
}
