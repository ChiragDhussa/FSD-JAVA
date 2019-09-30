import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter any number to calculate factorial: ");
		int fact = sc.nextInt();		
		System.out.println(factNum(fact));
	}
	static int factNum(int num){
		if(num == 1){
			return 1;
		}
		return num * factNum(num-1);
	}
}