import java.util.*;
class ArrayDemo6{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("enter elements:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter ker:");
		int key = sc.nextInt();
		int cnt = 0;
		System.out.println("print array:");
		
		for(int i=0;i<size;i++){
			if(arr[i]%key==0){
					System.out.println("element at index:"+i);
				}
			else{
				System.out.println("element not found");
			}
		}
	}
}
			
		
