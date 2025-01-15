import java.util.*;
class ArrayDemo4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("elements  in array:");
		int count = 0;
		int occur = sc.nextInt();
		for(int j=0;j<size;j++){
			if(occur==arr[j]){
				occur = arr[j];
				count++;
			}
		}
		if(count>2){
			System.out.println("Occurs more than 2 times");
		}
		else{
			System.out.println("Occurs less than 2 times");
		}
	}
}
		
