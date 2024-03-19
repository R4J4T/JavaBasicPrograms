import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 1){
            System.out.println("Invalid Number");
        }
        System.out.print(a);
        System.out.print(" "+b);
        for(int i = 1; i<=n; i++){
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(" "+ sum);
        }
    }
}
