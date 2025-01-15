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
		System.out.println("elements  in array:");
		
		int max = arr[0];
		for(int j=0;j<size;j++){
			if(max<arr[j]){
				max = arr[j];
			}
		}
		System.out.println(max);
		int max2 =0;
		for(int j=0;j<size;j++){
			max2 = arr[j];
			if(max2>=arr[j] && max2<max){
				max2 = arr[j];
			}
		}
		System.out.println(max2+" is second maximum element in array");
		
	}
}
		
