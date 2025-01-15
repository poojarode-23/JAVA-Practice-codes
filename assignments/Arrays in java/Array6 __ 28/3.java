import java.util.*;
class ArrayDemo3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("enter elements:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		
		int key = sc.nextInt();
		int cnt = 0;
		System.out.println("print array:");
		
		for(int i=0;i<size;i++){
			if(arr[i] == key){
				key = key*key*key;
				System.out.println(key);
			}
			else{
				System.out.println(arr[i]);
			}
		}
	}
}
			
		
