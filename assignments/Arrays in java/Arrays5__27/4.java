import java.util.*;
class ArrayDemo4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements in array:");
		int flag = 0;
		int temp = arr[0]; 
		for(int j=0;j<size;j++){
			if(temp==arr[j]){
				temp=arr[j];
				flag = 0;
				System.out.println("First duplicate element present at index "+j);
		
			}
			else{
				flag=1;
			}
		}	
	}
}
			
