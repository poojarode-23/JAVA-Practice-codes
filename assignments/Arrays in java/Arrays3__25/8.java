import java.util.*;
class ArrayDemo8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		int count=0;
		System.out.println("elements  in array:");
		for(int j=1;j<=size;j++){
			for(int i=1;i<size;i++){
				if(arr[i]%i==0){
					count = arr[i]%10;
					count++;
				}	
				else{
					System.out.print(arr[i]+ " ");
				}
			}	
		}
		System.out.println(count);
	}
}
		
