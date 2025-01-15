import java.util.*;
class PatternDemo3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rows:");
		int row = sc.nextInt();
		
		for(int i=row;i>=1;i--){
			char ch='A';
			for(int j=1;j<=i;j++){ 
				System.out.print(" ");
				ch++;
			}
			for(int k=1;k<=row-i+1;k++){
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
}
