import java.util.Scanner;

public class StrongNumber
{
    static int f[] = new int[10];

    // Fills factorials of digits from 0 to 9.
    static void preCompute()
    {
        f[0] = f[1] = 1;
        for (int i = 2; i<10; ++i)
            f[i] = f[i-1] * i;
    }

    // Returns true if x is Strong
    static boolean isStrong(int x)
    {
        int factSum = 0;

        // Traverse through all digits of x.
        int temp = x;
        while (temp>0)
        {
            factSum += f[temp%10];
            temp /= 10;
        }

        return (factSum == x);
    }

    // main function
    public static void main (String[] args)
    {
        // calling preCompute
        preCompute();
        Scanner sc = new Scanner(System.in);
        // first pass
        int x = sc.nextInt();
        if(isStrong(x))
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");

    }
}
