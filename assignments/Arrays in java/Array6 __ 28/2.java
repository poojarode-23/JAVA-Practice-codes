import java.util.*;
class ArrayDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Elements in array:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		int cnt = 0;
		for(int i=0;i<size;i++){
			for(int j=2;j<arr[i];j++){
				if(arr[i]%j==0){
					cnt++;
					sum+=arr[i];
				}
			}
		}
			System.out.println("sum of all prime numbers: "+sum);
			System.out.println("Count of prime nubrers in an array:"+cnt);	
	}
}
			
