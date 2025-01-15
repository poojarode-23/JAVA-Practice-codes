import java.util.*;
class ArrayDemo7{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("enter elements:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("print array:");
		
		for(int i=0;i<size;i++){
			if(arr[i]>=65 && arr[i]<=90){
				System.out.println((char)arr[i]);
			}
			else{
				System.out.println(arr[i]);
			}
		}
	}
}
			
		
