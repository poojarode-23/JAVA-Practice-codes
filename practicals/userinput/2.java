import java.util.*;
class InputDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your num:");
		int num = sc.nextInt();
		
		if(num%2==0){
			System.out.println(num + "is even");
		}
		else{
			System.out.println(num + "is odd");
		}
	}
}
