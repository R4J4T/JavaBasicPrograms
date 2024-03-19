import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int m=0;
        int c=0;
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();//it is the number to be checked
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(int i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    c=1;
                    break;
                }
            }
            if(c==0)  { System.out.println(n+" is prime number"); }
        }//end of else
    }
}
