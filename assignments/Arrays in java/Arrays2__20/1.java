import java.util.*;
class ArrayDemo1
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
			if(arr[j]%2==0){
				System.out.print(arr[j]+" ");
				count = arr[j];
				count%=10;
				System.out.println(count);
			}	
		}
	}
}
		
