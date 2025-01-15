import java.util.*;
class ArrayDemo8{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array: ");
		int size = sc.nextInt();
		
		char arr[] = new char[size];
		
		System.out.println("enter elements:");
		for(int i=0;i<size;i++){
			arr[i] = sc.next().charAt(size);
		}
		System.out.println("print array:");
		
		int temp = 0;
		for(int i=0;i<size;i++){
				temp = arr[size-1+i];
			System.out.println(temp);
		}
	}
}
			
		
