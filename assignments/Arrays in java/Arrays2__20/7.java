import java.util.*;
class ArrayDemo7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements:");
		
			for(int i=0;i<size;i++){
				arr[i] = sc.nextInt();
			}
			//if(arr[size]%2==0){
				for(int j=0;j<size;j++){
					if(j%2==0){
					continue;
					}
					System.out.println(arr[j]);
			}
		/*}
			else{	
				for(int j=0;j<size;j++){
					System.out.println(arr[j]);
				}
			}*/		
	}
}
		
