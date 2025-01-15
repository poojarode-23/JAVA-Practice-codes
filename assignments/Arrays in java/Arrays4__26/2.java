import java.util.*;
class ArrayDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("elements  in array:");
		int min = arr[0];
		for(int j=0;j<size;j++){
			if(min>arr[j]){
				min = arr[j];
			}
		}
		int max = arr[0];
		for(int j=0;j<size;j++){
			if(max<arr[j]){
				max = arr[j];
			}
		}
		int diff = max-min;
		System.out.println(diff);
	}
}
		
