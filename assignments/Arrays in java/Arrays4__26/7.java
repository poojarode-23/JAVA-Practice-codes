import java.util.*;
class ArrayDemo7{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter size:");
	int size = sc.nextInt();
	
	char arr[] = new char[size];
	for(int i=0;i<size;i++){
		arr[i] = sc.next().charAt(0);
	}
	
	for(int i=0;i<size;i++){
		if(arr[i]<=122 && arr[i]>=97){
			System.out.println((char)(arr[i]-32));
		}
		else{
			System.out.println(arr[i]);
		}
	}
}

