import java.util.*;
class ArrayDemo6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		
		char arr[] = new char [size];
		for(int i=0;i<size;i++){
			arr[i] = sc.next().charAt(0);
		}
		System.out.println("elements  in array:");
		for(int j=0;j<size;j++){
			if(arr[j]=='a'||arr[j]=='e'||arr[j]=='i'||arr[j]=='o'||arr[j]=='u'){
				continue;	
			}
			else{
				System.out.print(arr[j]+ " ");
			}	
		}
		System.out.println();
	}
}
		
