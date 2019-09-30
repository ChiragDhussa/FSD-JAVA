import java.util.Scanner;
public class NumbersAdd{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1 + num2 + num3;
		int flag = 0;
		if(num1 < 40){
			flag++;
		}
		if(num2 < 40){
			flag++;
		}
		if(num3 < 40){
			flag++;
		}
		if(sum < 120){
			flag++;
		}
		if(flag == 0){
			System.out.println("PASSING");
		}
		if(flag > 0){
			System.out.println("FAILING");
		}
	}
}