import java.util.*;
class ArrayDemo4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		
		int arr[]  = new int[size];
		System.out.println("Enter elements:");
		for(int i=0;i<size;i++){
			arr[i] = sc.next().charAt(0);
		}
		for(int j=0;j<size;j++){
			System.out.println(arr[j]+" ");
		
		System.out.print("Enter the number to search in array:"); 
		//for(int k=0;k<size;k++){
			arr[j] = sc.nextInt();	
			System.out.println(arr[j]+" found at index "+j);
		}
	}
}
			
