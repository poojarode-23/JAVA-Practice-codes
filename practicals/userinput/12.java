import java.util.*;
class InputDemo12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter maths marks:");
		int num1 = sc.nextInt();
		
		System.out.print("Enter english marks:");
		int num2 = sc.nextInt();
		
		System.out.print("Enter marathi marks:");
		int num3 = sc.nextInt();
		
		System.out.print("Enter science marks:");
		int num4 = sc.nextInt();
		
		int num = sc.nextInt();
		num = num1+num2+num3+num4;
		System.out.println(num);
		
		
		if(num<=400){
			System.out.println(num +" out of 400");
		}
		else{
			System.out.println("invalid data");
		}
		
	}
}
