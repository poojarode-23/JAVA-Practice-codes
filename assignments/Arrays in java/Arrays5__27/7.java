import java.util.*;
class ArrayDemo7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Elements in array:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++){
			for(int j=2;j<arr[i];j++){
				if(arr[i]%j==0){
					System.out.println("First prime number present at index "+i);
				}
				break;
			}
			
		}	
	}
}
			
