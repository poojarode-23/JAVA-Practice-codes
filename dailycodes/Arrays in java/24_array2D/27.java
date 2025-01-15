import java.util.*;

class ArrayDemo5{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr array size:");
		int size = sc.nextInt();
		int arr[] = new int [size];
		
		System.out.println("Size of array :" + arr.length);
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			System.out.println("array elements:" + arr[i]);
		}
	}
}
		
