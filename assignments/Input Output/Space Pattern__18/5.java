import java.util.*;
class PatternDemo5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rows:");
		int row = sc.nextInt();
		
		int num=1;
		for(int i=row;i>=1;i--){
			for(int j=1;j<=i;j++){ 
				System.out.print(" "+" ");

			}
			for(int k=1;k<=row-i+1;k++){
				System.out.print(num*k +" ");
				
			}
			num++;
			System.out.println();
			num = row-i+2;
		}
	}
}
