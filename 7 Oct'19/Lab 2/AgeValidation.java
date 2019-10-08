import java.util.Scanner;

class AgeValidation{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		try{
			if(age < 15) {
				throw new AgeChecker(age);
			}
			System.out.println("Your age is " + age + ".\nThus, you're eligible for driving.");
		}
		catch(AgeChecker e){
			System.out.println(e);
		}
	}
}
class AgeChecker extends Exception {

	String msg = "";
	int age;

	AgeChecker(int age){
		this.age = age;
	}
	@Override

	public String toString(){
		if(age < 15)
			msg = "Your age should be above 15.\nHence, you're not eligible for driving.";
		return msg;
	} 
}