import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to calculate factorial: ");
		int fact = sc.nextInt();
		//Non-recursive method
		System.out.println("Non-recursive method:");
		System.out.println(factNum(fact));
		//Recursive method
		for(int i=1; i<=number; i++){
            System.out.print(recursiveFib(i) +" ");
        }
	}
	static int factNum(int num){
		if(num == 1){
			return 1;
		}
		return num * factNum(num-1);
	}
	static int recursiveFib(int num){
		if(number == 1 || number == 2){
            return 1;
        }
      
        return recursiveFib(number-1) + recursiveFib(number -2); //tail recursion
	}
}