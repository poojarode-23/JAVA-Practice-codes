import java.util.*;
class InputDemo9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your num1:");
		int num1 = sc.nextInt();
		
		for(int i=10;i>=1;i--){
			System.out.println(num1*i);
		}
		
	}
}
