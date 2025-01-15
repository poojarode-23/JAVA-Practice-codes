import java.util.*;
class ArrayDemo6{	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		char arr[] = new char[size];
		
		System.out.println("Enter characters:");
		for(int i=0;i<size;i++){
			arr[i] = sc.next().charAt(0);
		}
		
		for(int j=0;j<size;j++){
			System.out.print(arr[j]+" ");
			
		}
		
		System.out.println();
	}
} 
		
		
