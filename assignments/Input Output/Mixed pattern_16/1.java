import java.util.*;
class Pattern1{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("enter rows:");
		int row = sc.nextInt();
		System.out.print("Enter columns:");
		int col = sc.nextInt();
		
		int num = 1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<col;j++){
				System.out.print(num++ + " " );
			}
			System.out.println();
		}
	}
}