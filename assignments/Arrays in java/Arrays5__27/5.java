import java.util.*;

class ArrayDemo5{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter elements:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		int count = 0;
		int temp=arr[0];
		for(int i=temp;i<size;i/=10){
			count++;
			System.out.println("number of digits : "+count);
		}
	}
}
