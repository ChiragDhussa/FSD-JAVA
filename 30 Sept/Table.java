import java.util.Scanner;

public class Table{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for table: ");
		int tab = sc.nextInt();
		System.out.println("Enter the limit: ");
		int limit = sc.nextInt();
		System.out.println("Table of "+ tab + " is:");
		for (int i = 1; i <= limit ; i++ ) {
			System.out.println(tab + " * " + i + " = " + (tab*i));
		}
	}
}