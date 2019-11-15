
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            System.out.println(fun(num));
        }
    }

    private static int fun(int num) {
        int x = 0;
        int t = 0 ;
        while(x>= 0){
            if(Fib(x)>=num){
                t = Fib(x);
                break;
            }else{
                x++;
            }
        }
        int u = Fib(x-1);
        return Math.min(Math.abs(u-num),Math.abs(t-num));
    }

    public static int Fib(int N){
        if(N == 0 ){
            return 1;
        }
        if(N == 1){
            return 1;
        }
        return Fib(N-1)+Fib(N-2);
    }
}
