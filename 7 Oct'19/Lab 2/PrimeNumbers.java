import java.util.Scanner;

class PrimeNumbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit for prime numbers: ");
        int limit = sc.nextInt();
        System.out.println("Prime numbers till " + limit + " are:");
        for(int i = 2; i <= limit; i++)
        {
            int count=0;
            for(int j = 1; j <= i/2; j++)
            {
                if(i % j == 0)  //Not a prime number
                {
                    count++;
                }
            }
            if(count == 1)
            {
                System.out.println(i+" ");
            }
        }
    }
}