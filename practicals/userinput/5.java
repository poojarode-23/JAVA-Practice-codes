import java.util.*;
class InputDemo5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your num:");
		int num = sc.nextInt();
		
		if(num%8==0){
			System.out.println(num + "is divisible by 8");
		}
		else{
			System.out.println(num + "is not divisible by 8");
		}
	}
}
