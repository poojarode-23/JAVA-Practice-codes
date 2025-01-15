import java.util.*;
class ArrayDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements in array:");
		int sum1 = 0;
		int sum2 = 0;

		for(int j=0;j<size;j++){
			if(arr[j]%2==0){
				sum1+=arr[j];
			}
			else{
				sum2+=arr[j];
			}
		}
		System.out.println("even sum "+ sum1);
		System.out.println("odd sum "+sum2);
	}
}
			
