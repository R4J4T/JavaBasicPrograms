import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int range = sc.nextInt();
        int mul = 0;
        //User input multiplication
        for(int i= 1; i<=range; i++){
            mul = n*i;
            System.out.println(n+" x "+ i+" = "+mul);
        }

        // User range defined multiplication
        for(int j = 1; j<=range; j++){
            for(int k = 1; k<=range; k++){
                mul = j*k;
                System.out.println(j+" x "+ k+" = "+mul);
            }
        }
    }
}
