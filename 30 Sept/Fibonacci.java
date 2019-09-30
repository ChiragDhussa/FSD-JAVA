public class Fibonacci {
	public static void main(String[] args) {
		int fib1 = 1, fib2 = 1;
        for(int i = 1; i <= 89; ++i)
        {
            System.out.print(fib1 + " ") ;
            int temp = fib1 + fib2;
            fib1 = fib2;
            fib2 = temp;
        }
	}
}