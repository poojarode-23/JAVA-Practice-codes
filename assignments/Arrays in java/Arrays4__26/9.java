import java.util.*;
class ArrayDemo9{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter size:");
	int size = sc.nextInt();
	
	char arr[] = new char[size];
	for(int i=0;i<size;i++){
		arr[i] = sc.next().charAt(0);
	}
	for(int i=0;i<size;i++){
		if(arr[i]>=97 && arr[i]<=122){
			System.out.println(arr[i]);
		}
		else{
			System.out.println("#");
		}
	}

	}
}

