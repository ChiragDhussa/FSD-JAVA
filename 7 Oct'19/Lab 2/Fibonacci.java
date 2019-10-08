public class Fibonacci {
	public static void main(String[] args) {
		int fib1 = 1, fib2 = 1;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the max limit for fibonacci series: ");
        int number = sc.nextInt();
        //Non-recursive method
        System.out.println("Non-recursive method: ");
        for(int i = 1; i <= number; ++i)
        {
            System.out.print(fib1 + " ") ;
            int temp = fib1 + fib2;
            fib1 = fib2;
            fib2 = temp;
        }
        System.out.println("");
        System.out.println("\nRecursive method: ");
        //Recursive method
        for(int i=1; i<=number; i++){
            System.out.print(recursiveFib(i) +" ");
        }
	}

    static int recursiveFib(int number){

        if(number == 1 || number == 2){
            return 1;
        }      
        return recursiveFib(number-1) + recursiveFib(number -2);
    }
}