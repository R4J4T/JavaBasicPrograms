import java.util.Scanner;

public class CountOfNth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 0;
        while(a>0){
            c++;
            a = a/10;
        }
        System.out.println("Count : "+ c);
    }
}
