class Palindrome{
	public static void main(String[] args) {
		System.out.println("Enter any string for palindrome: ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String str = sc.nextLine();
		String str2 = "";
		for(int i = str.length()-1 ; i >= 0; i--){
			str2 += str.charAt(i);  
		}
		if(str.equals(str2))
			System.out.println(str + " is Palindrome.");
		else
			System.out.println(str + " is not Palindrome.");

	// 	String str2 = new StringBuffer(str).reverse().toString();
	// 	if(str.equals(str2)){
	// 		System.out.println("String is palindrome");
	// 	}
	// 	else
	// 		System.out.println("String is not palindrome");
	// }
	}
}