import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int steps = 0;
        int i = 0;
        while (i < str.length()){
            if (str.charAt(i) == '0' && str.charAt(i + 1) == '0' && i < str.length() - 1){
                i += 2;
                steps += 1;
            }
            else{
                i += 1;
                steps += 1;
            }
        }
        System.out.println(steps);
    }
}
