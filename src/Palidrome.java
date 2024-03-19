import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int sum = 0;
        int r = 0;
        while(n>0){
            r = n%10;
            sum = (sum*10) + r;
            n = n/10;
        }
        if(sum == x){
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not a Palindrome Number");
        }
    }
}
