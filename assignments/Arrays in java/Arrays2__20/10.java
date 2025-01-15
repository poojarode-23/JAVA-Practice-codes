import java.util.*;
class ArrayDemo10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter elements:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for(int j=0;j<size;j++){
			if(max<arr[j]){
				max = arr[j];
			}
		}	
		System.out.println("maximum element is "+ max);
	}
}
		
