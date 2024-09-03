import java.util.Scanner;
public class Problem24 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int steps = 0;
        int i = 0;
        while (i < str.length()){
            if (i < str.length() - 1 && str.charAt(i) == '0' && str.charAt(i+1) == '0'){
                steps += 1;
                i += 2;
            }
            else{
                steps += 1;
                i += 1;
            }
        }
        System.out.println(steps);
    }
}