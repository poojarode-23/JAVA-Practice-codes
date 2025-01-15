import java.util.*;
class ArrayDemo3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("elements occurs in array:");
		int occur = sc.nextInt();
		int count=0;
		for(int j=0;j<size;j++){
			if(occur  == arr[j]){
				occur = arr[j];
				count=occur%10;	
			}	
		}
		System.out.println(occur+" is found in "+ count +" times");
	}
}
		
