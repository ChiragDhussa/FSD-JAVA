class TrafficLights {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("RED");
		System.out.println("YELLOW");
		System.out.println("GREEN");
		System.out.print("Enter any light: ");
		String light = sc.nextLine();
		switch(light){
			case "RED":
				System.out.println("STOP");
				break;
			case "YELLOW":
			System.out.println("READY");
			break;
			case "GREEN":
			System.out.println("GO");
			break;
			default :
			System.out.println("WRONG SELECTION");
			break;
		}

	}
}