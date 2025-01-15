import java.util.*;
class ArrayDemo5{	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter elements:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int j=0;j<size;j++){
			if(arr[j]<10){
				System.out.println(arr[j]+" is less than 10");	
			}
		}
		System.out.println();
	}
} 
		
		
