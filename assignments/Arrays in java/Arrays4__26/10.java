import java.util.*;
class ArrayDemo10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		
		char arr[] = new char[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.next().charAt(0);
		}
		System.out.println("elements  in array:");
		int occur = sc.next().charAt(0);
		for(int j=0;j<size;j++){
			if(occur==arr[j]){
				break;
			}
			else{
				System.out.println(arr[j]);
			}
		}
	}
}
		
