import java.util.*;
class Pattern8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rows:");
		int row = sc.nextInt();
	
		System.out.print("Enter columns:");
		int col = sc.nextInt();
		
		
		char ch = 'J' ;
		for(int i=row;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(ch-- +" ");
				
			}
			
			System.out.println();
		}
	}
}
