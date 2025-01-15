import java.util.*;
class ArrayDemo10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		int product=1;
		System.out.println("elements  in array:");
		for(int i=0;i<size;i++){
			for(int j=2;j<arr[i];j++){
				if(arr[i]%j==1){
					product=product*arr[i];
					break;
				}	
			}	
		}
		System.out.println(product);
					
	}
}
		
