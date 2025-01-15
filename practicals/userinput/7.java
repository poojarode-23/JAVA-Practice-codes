import java.util.*;
class InputDemo7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your num:");
		int num = sc.nextInt();
		
		if(num%16==0){
			System.out.println(num +" is present in table 16");
		}
		else{ 	
			System.out.println(num+" is not present in table 16");
		}
	}
}
