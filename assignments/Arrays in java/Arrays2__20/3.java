import java.util.*;
class ArrayDemo3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		
		char arr[]  = new char[size];
		System.out.println("Enter elements:");
		for(int i=0;i<size;i++){
			arr[i] = sc.next().charAt(0);
		}
		for(int j=0;j<size;j++){
			if(arr[j]=='a' ||arr[j]=='e' ||arr[j]=='i' ||arr[j]=='o' ||arr[j]=='u'){
				System.out.println(arr[j]+" is found index "+j);
			}
		}
		System.out.println();
	}
}
			
