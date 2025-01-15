import java.util.*;
class ArrayDemo9{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.print("Enter number:");
		int num = sc.nextInt();
		for(int i=0;i<size;i++){
			while(num!=0){
				num/=10;
				num%=10;
				num++;
			
			arr[i]=num;
			System.out.println(arr[i]);
		}
		}	
	}
}
			
		
