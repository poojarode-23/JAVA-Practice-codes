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
		
		for(int j=0;j<size;j++){
			System.out.println("elements in array:");
			int occur = sc.nextInt();
			System.out.println(occur +" found at index "+j);
		}
	}
}
		
