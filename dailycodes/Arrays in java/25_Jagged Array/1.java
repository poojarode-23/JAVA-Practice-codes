import java.util.*;
class JaggedArray1{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("enter array size:");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter Elements:");
	
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		for(int j=0;j<size;j++){
			System.out.println(arr[j]);
		}
	}
}
	
		
