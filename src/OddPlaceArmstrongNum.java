import java.util.Scanner;

public class OddPlaceArmstrongNum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter lower and upper limit");
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        for(int i = lower; i<=upper; i++){
            int n = i;
            int sum = 0;
            int count = 0;
            int temp = n;
            while(n>0){
                count++;
                n = n/10;
            }
            n = temp;
            while(n>0){
                int r = n%10;
                sum = sum + (int)Math.pow(r,count);
                n = n/10;
            }
            if(temp == sum){
                if(sum % 2 !=0)
                {
                    System.out.println("Armstrong Number = " + sum);
                }
            }
        }
    }
}
