import java.util.*;
class ArrayDemo4{
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
			for(int j=0;i<size;i++){
				if(arr1[i] == arr2[j] ){
					System.out.println("Common elements are:"+arr1[i]);
					break;
				}
				else{
					System.out.println("No common elements");
				}
			}
		}
	}
}
			
		
