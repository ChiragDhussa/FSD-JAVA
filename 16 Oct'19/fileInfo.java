import java.io.*;

class fileInfo{
	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter the name of file: ");
		String fileName = sc.nextLine();
		File myFile = new File(fileName);
		System.out.println("File with the name: " + fileName + (myFile.exists()?" exists.":" doesn't exists."));
		System.out.println("Is the file readable? "+ myFile.canRead());
		System.out.println("Is the file writable? "+ myFile.canWrite());
		System.out.println("Size of the file is: "+ myFile.length()+" bytes");
		System.out.println("Type of file is: " + type(fileName));
	}
	
	public static String type(String name) {

	    String fileName = name;
	    int index = fileName.lastIndexOf('.');
    	return (index==-1) ? "No file type.":fileName.substring(index + 1);
	}
}