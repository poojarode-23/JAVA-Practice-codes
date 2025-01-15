import java.util.*;
class InputDemo3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age:");
		int age = sc.nextInt();
		
		if(age>=18){
			System.out.println("voter is eligible for voting ");
		}
		else{
			System.out.println("vote is not eligible for voting");
		}
	}
}
