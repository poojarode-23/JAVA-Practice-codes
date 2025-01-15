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
		int count = 0;
		for(int j=0;j<size;j++){
			if(j%2==1){
	
			System.out.println(arr[j]+" is an odd indexed");
			}
		}
		//System.out.println(count);
		
	}
} 
		
		
