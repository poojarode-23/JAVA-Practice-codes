import java.util.*;
class ArrayDemo5{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array: ");
		int size = sc.nextInt();
		
		int arr1[] = new int[size];
		int arr2[] = new int[size];
		
		System.out.println("enter elementsfor array1:");
		for(int i=0;i<size;i++){
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter elementsfor array2:");
		for(int i=0;i<size;i++){
			arr2[i] = sc.nextInt();
		}
		System.out.println("print array:");
		for(int i=0;i<size;i++){
			System.out.print(arr1[i] +" ");
		}
		for(int j=0;j<size;j++){
			System.out.print(arr2[j] +" ");	
		}
		System.out.println();
	}
}
			
		
