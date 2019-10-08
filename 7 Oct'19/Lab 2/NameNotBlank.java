import java.util.Scanner;

class NameNotBlank{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter second name: ");
		String lastName = sc.nextLine();
		try {
			if(firstName.length()==0 || lastName.length()==0){
				throw new BlankNameException(firstName, lastName);	
			}			
			System.out.println("Your full name is: " + firstName + " " + lastName);
  		}
		catch(BlankNameException e){
			System.out.println(e) ;
		}
	}
}
class BlankNameException extends Exception{

	String firstName, lastName, msg = "";
	boolean flag = false;

	BlankNameException(String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
    }

    @Override
    public String toString(){
    	if(firstName.length()==0 || lastName.length()==0){
    		msg = "First name or Last name can't be left blank";
    	}
    return msg;
    }
}