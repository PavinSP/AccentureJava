import java.util.Scanner;
class Problem04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int remaining_time = 240 - p;
        int count = 0;
        for (int i = 1; i <=n; i++){
            int solving_time = i*5;
            if (remaining_time >= solving_time){
                remaining_time -= solving_time;
                count++;
            }
        }
        System.out.println(count);
    }
}