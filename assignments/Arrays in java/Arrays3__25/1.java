import java.util.*;
class ArrayDemo1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("elements in array:");
		for(int j=0;j<size;j++){
			arr[j]+=15;
			System.out.println(arr[j]);
		}
	}
}
		
