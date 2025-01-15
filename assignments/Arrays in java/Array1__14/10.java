import java.util.*;
class ArrayDemo10{	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter runs in IPL:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for(int j=0;j<size;j++){
			
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		
	}
} 
		
		
