import java.util.*;
class ArrayDemo6{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter size:");
	int size = sc.nextInt();
	
	char arr[] = new char[size];
	for(int i=0;i<size;i++){
		arr[i] = sc.next().charAt(0);
	}
	int count1 = 0;
	int count2 = 0;
	for(int i=0;i<size;i++){
		if(arr[i]=='a'||arr[i]=='e'||arr[i]=='o'||arr[i]=='i'||arr[i]=='u'){
			count1++;
		}
		else{
			count2++;
		}
	}
	System.out.println("count of vowels "+count1);
	System.out.println("count of constants "+count2);
	}
}

