import java.util.*;
class ArrayDemo1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Elements in array:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		int flag=0;
		int max = arr[0];
		for(int i=0;i<size;i++){
			if(max>arr[i]){
				max = arr[i];
				flag = 0;
			}
			else{
				flag = 1;
			}
		}
		if(flag == 0){
			System.out.println("given array is in descending order");
		}
		else{
			System.out.println("given array is not in descending order");
		}		
	}
}
			
