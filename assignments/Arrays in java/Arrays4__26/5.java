import java.util.*;
class ArrayDemo5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("elements  in array:");
		int temp = 0;
		for(int j=0;j<size;j++){
			temp = arr[j];
			arr[j] = arr[size-1-j];
			arr[size-1-j]=temp;
			System.out.println(arr[j]);
		}
	}
}
		
