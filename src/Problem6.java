import java.util.Scanner;
class Problem6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        if (arr.length == 1){
            System.out.println(arr[0]);
        }
        else{
            int max_count = 0;
            int max_count_element = Integer.MIN_VALUE;
            boolean tie = false;
            for (int i = 0; i < n; i++){
                int count = 0;
                for (int j = 0; j < n; j++){
                    if (arr[i] == arr[j]){
                        count++;
                    }
                }
                if (count > max_count){
                    max_count_element = arr[i];
                    max_count = count;
                    tie = false;
                }
                else if(count == max_count && arr[i] != max_count_element){
                    tie = true;
                }
            }
            if (tie) System.out.println(-1);
            else System.out.println(max_count_element   );
        }
    }
}