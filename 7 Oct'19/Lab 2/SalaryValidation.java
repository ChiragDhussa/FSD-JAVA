import java.util.Scanner;
import com.cg.eis.exception.LowSalaryException;

class SalaryValidation{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		int salary = sc.nextInt();
		try{
			if(salary < 3000) {
				throw new LowSalaryException(salary);
			}
			System.out.println(salary + " is an appropriate salary.");
		}
		catch(LowSalaryException e){
			System.out.println(e);
		}
	}
}