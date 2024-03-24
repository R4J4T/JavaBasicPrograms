import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for pattern : ");
        int n =  sc.nextInt();
        int star = 1;
        int space = n-1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=space; j++){
                System.out.print("  ");
            }
            for(int k = 1; k<=star; k++){
                System.out.print("* ");
            }
            System.out.println();
            star += 2;
            space -= 1;
        }
    }
}
