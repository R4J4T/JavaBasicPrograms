import java.util.Scanner;

public class NivenOrHarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int r = 0;
        int temp = n;
        while(n>0){
            r = n%10;
            sum = sum + r;
            n = n/10;
        }
        if(temp%sum == 0){
            System.out.println("Niven Number");
        }
        else {
            System.out.println("Not a Niven Number");
        }
    }
}
