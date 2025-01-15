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
		for(int j=0;j<size;j++){
			if(arr[j]%2==0){
				System.out.print( arr[j]+" ");	
			}
			else{
				System.out.print(arr[j]*arr[j]+ " ");
			}	
		}
		System.out.println();
	}
}
		
