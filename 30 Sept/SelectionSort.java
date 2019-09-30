import java.util.Scanner;

public class BubbleSort { 

	public static void main(String[] args) {
		int arr[] = new int[5];
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 5 elements");
		for (int i = 0; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		for(int a = 0; a < arr.length;a++){
			for(int b = a+1; b < arr.length; b++){
				if(arr[a] > arr[b]){
					temp = arr[a];
                    arr[a] = arr[b];
                    arr[b]= temp;
				}
			}			
		}
		System.out.println("After Sorting:");
		for( int i : arr){
			System.out.println(i);
		}
	}
}