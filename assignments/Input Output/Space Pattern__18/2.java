import java.util.*;
class PatternDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rows:");
		int row = sc.nextInt();
		
		for(int i=row;i>=1;i--){
		int num=4;
			for(int j=1;j<=i;j++){ 
				System.out.print(" ");
			}
			for(int k=1;k<=row-i+1;k++){
				System.out.print(num--);
			}
			System.out.println();
		}
	}
}