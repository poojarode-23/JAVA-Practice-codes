import java.util.*;
class Pattern9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rows:");
		int row = sc.nextInt();
	
		System.out.print("Enter columns:");
		int col = sc.nextInt();
		
		
		int ch = 'D' ;
		for(int i=row;i>=1;i--){
			int num = 1;
			for(int j=1;j<=i;j++){
				if(i%2==1){
				System.out.print((char)ch-- +" ");
				}
				else{
					System.out.print(num++ +" ");
				}
			}
			System.out.println();
		}
	}
}
