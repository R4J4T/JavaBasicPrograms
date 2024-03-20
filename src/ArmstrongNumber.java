import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

//Writing a Armstrong Number Program
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =  n;
        int sum = 0;
        int count = 0;
        int r = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        n = temp;
        while(n>0){
            r = n%10;
          sum = sum + (int)Math.pow(r,count);
          n = n/10;
        }
        if(temp == sum){
            System.out.println("Armstrong : "+sum);
        }
        else{
            System.out.println("Not an Armstrong");
        }
    }
}
