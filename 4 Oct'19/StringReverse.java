class StringReverse{

	public static void main(String[] args) {

		System.out.println("Enter any string for palindrome: ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("String after reversing: ");
		for(int i = str.length()-1 ; i >= 0; i--){
			System.out.print(str.charAt(i));
		}
	}
}