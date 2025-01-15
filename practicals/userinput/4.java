import java.util.*;
class InputDemo4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age:");
		int age = sc.nextInt();
		
		if(age>=18){
			System.out.println("eligible for voting");
		}
		else if{
			System.out.println("not eligible for voting");
		}
		else(age<0){
			System.out.println("invalid data");
		}
	}
}
