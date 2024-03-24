import java.util.Scanner;

public class InverseRightAngledTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for pattern : ");
        int n =  sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
