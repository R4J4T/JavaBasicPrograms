import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%9 == 1){
            System.out.println("Magic Number");
        }
        else{
            System.out.println("Not Magic Number");
        }
    }
}
