import java.util.*;
class ArrayDemo8{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array: ");
		int size = sc.nextInt();
		
		int arr1[] = new int[size];
		
		System.out.println("enter elementsfor array1:");
		for(int i=0;i<size;i++){
			arr1[i] = sc.nextInt();
		}
		int min = arr1[0];
		System.out.println("print array:");
		for(int i=0;i<size;i++){
			if(arr1[i]<min){
				min = arr1[i];
			}
		}
		int min2=arr1[0];
		for(int i=0;i<size;i++){
			if(arr1[i]<min2 && arr1[i]>min){
				min2 = arr1[i];
			}
		}
		System.out.println(min2);
			
	}
}
			
		
