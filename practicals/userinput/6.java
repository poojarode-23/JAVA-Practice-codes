import java.util.*;
class InputDemo6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your num:");
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++){
			System.out.println(num*i);
		}
	}
}
