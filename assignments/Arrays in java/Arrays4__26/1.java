import java.util.*;
class ArrayDemo1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("elements  in array:");
		int avg = 0;
		int sum = 0;
		for(int j=0;j<size;j++){
			sum+=arr[j];
			
		}
		System.out.println(sum);
		avg = sum/size;
		System.out.println(avg);
	}
}
		
