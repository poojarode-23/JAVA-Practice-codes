import java.util.*;
class ArrayDemo8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter elements:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		
		for(int j=0;j<size;j++){
			if(arr[j]>5 && arr[j]<9){
				System.out.println(arr[j]+" is greater than 5 and  less than 9");
			}	
		}
	}
}
		
