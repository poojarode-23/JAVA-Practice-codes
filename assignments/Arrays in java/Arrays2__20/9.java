import java.util.*;
class ArrayDemo9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter elements:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		for(int j=0;j<size;j++){
			if(min>arr[j]){
				min = arr[j];
			}
		}	
		System.out.println("minimum element is "+min);
	}
}
		
