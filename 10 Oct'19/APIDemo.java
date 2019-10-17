import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

class Person{
	private String name, address;
	private Integer id;

	Person(String name, Integer id, String address){
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String[] getName(){
		return this.name.split(" ");
	}

	public Integer getId(){
		return this.id;
	}

	public String getAddress(){
		return this.address;
	}

	@Override
	public String toString(){
		return "Name: " + this.name + ", ID: " + this.id + ", Address: " + this.address;
	}
}

class SortByName implements Comparator{
	//
	@Override
	public int compare(Object ob1, Object ob2){
		return ((Person)ob1).getName().compareTo(((Person)ob2).getName());
	}
}

class SortById implements Comparator{
	@Override
	public int compare(Object ob1, Object ob2){
		return ((Person)ob1).getId().compareTo(((Person)ob2).getId());
	}
}

class SortByAddress implements Comparator{
	@Override
	public int compare(Object ob1, Object ob2){
		return ((Person)ob1).getAddress().compareTo(((Person)ob2).getAddress());
	}
}

class APIDemo{
	public static void main(String[] args) {
		String name, address;
		int id;

		ArrayList list = new ArrayList();

		Scanner scan = new Scanner(System.in);
		while(true){
		System.out.println("1. Add a person\n2. Display the persons\n3. Search the persons\n4. Delete a person\n5. Sort the data");
		System.out.println("What do you want to do?");
		int choice = scan.nextInt();
		
		switch(choice){
			case 1: 
				System.out.println("How many persons you want to store?");
				Integer limit = scan.nextInt();
				scan.nextLine();

				for(int v = 1; v <= limit; v++){
					System.out.println("Enter name");
					name = scan.nextLine();

					System.out.println("Enter id");
					id = scan.nextInt();

					scan.nextLine();

					System.out.println("Enter address");
					address = scan.nextLine();

					list.add(new Person(name, id, address));
				}
				break;

			case 2:
				System.out.println("We have the following records:");
				for(Object ob : list){
					System.out.println(((Person)ob).getName());
					System.out.println(((Person)ob).getId());
					System.out.println(((Person)ob).getAddress());
				}
				break;

			case 3:
				System.out.println("Which person do you want to search?");
				scan.nextLine();
				String name1 = scan.nextLine();
				int flag=0;
				for(Object ob : list){
					if(((Person)ob).getName().equals(name1)){
						System.out.println("Details of " + name1 + " are: ");
						System.out.println(list.get(flag));
					}
					flag++;
				}
				break;

			case 4:
				System.out.println("Which person do you want to remove?");
				scan.nextLine();
				String del = scan.nextLine();
				for(Object ob : list){
					if(((Person)ob).getName().equals(del)){
						list.remove(ob);
						break;
					}
				}
				break;

			case 5:
			System.out.println("1. Sort by name\n2. Sort by ID\n3. Sort by Address");
			int sortType = scan.nextInt();

			switch(sortType){
				case 1:
					Collections.sort(list, new SortByName());
					System.out.println(list);
					break;
				case 2:
					Collections.sort(list, new SortById());
					System.out.println(list);
					break;
				case 3:
					Collections.sort(list, new SortByAddress());
					System.out.println(list);
					break;
				default:
					System.out.println("Wrong choice entered.");
					break;
			}
			break;
			}
		}
	}
}