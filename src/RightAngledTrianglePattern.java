import java.util.Scanner;

public class RightAngledTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for pattern : ");
        int n =  sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
