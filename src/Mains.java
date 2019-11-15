import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int x  = scanner.nextInt();
            int y = scanner.nextInt();
            int [][]arr = new int[x][y];
            for(int i = 0 ; i < x ; i++){
                arr[i][0] = 1;
            }
            for(int i = 0 ; i < y ; i++){
                arr[0][i] = 1;
            }
            for(int i = 1 ; i < x ; i++){
                for(int j = 1 ;j < y ; j++){
                    arr[i][j] = arr[i-1][j]+arr[i][j-1];
                }
            }
            System.out.println(arr[x-1][y-1]);
        }
    }
}
