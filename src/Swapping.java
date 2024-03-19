import java.util.Scanner;

public class Swapping {
    public static void main(String[] args){
        // With third variable
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
        Swapping.withoutThirdVariable();
    }

    // Without third variable
    public static void withoutThirdVariable(){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println(x);
        System.out.println(y);
    }
}
