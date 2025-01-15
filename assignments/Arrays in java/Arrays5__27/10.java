import java.util.*;
class ArrayDemo10{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array: ");
		int size = sc.nextInt();
		
		int arr1[] = new int[size];
		
		System.out.println("enter elementsfor array1:");
		for(int i=0;i<size;i++){
			arr1[i] = sc.nextInt();
		}
		int fact = arr1[0];
		System.out.println("print array:");
		for(int i=0;i<size;i++){
			fact = fact*(arr1[i]-1);
			System.out.println(fact);
		
		}
		
	}
}
			
		
