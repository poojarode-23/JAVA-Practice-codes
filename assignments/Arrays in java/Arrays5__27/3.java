import java.util.*;
class ArrayDemo3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements in array:");
		int flag = 0;
		int temp = arr[0]; 
		for(int j=0;j<size;j++){
			if(temp==arr[size-j-1]){
				temp=arr[j];
				flag = 0;
			}
			else{
				flag = 1;
			}
		}
		if(flag == 0){
			System.out.println("given array is palindrome array");
		}
		else{
			System.out.println("not paindrome");
		}
	}
}
			
