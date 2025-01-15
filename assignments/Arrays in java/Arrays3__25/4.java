import java.util.*;
class ArrayDemo4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("elements  in array:");
		//
		int n1=0;
		//int n2=0;
		for(int j=0;j<size;j++){
			if(arr[j]%2==0){
				System.out.print("o"+" ");	
			}
			else{
				System.out.print("1"+ " ");
			}	
		}
		System.out.println();
	}
}
		
