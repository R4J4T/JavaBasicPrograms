import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range : ");
        int n = sc.nextInt();
        if(n<0){
            n = -n;
        }
        int count = 0;
        int sq= n*n;
        int temp = n;
        int lastdigit = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        lastdigit = sq%(int)Math.pow(10,count);
        if(lastdigit == temp){
            System.out.println("Automorphic");
        }
        else{
            System.out.println("Not Automorphic");
        }
    }
}
