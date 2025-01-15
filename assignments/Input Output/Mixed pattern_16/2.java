import java.util.*;
class Pattern2{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("enter rows:");
		int row = sc.nextInt();
		System.out.print("Enter columns:");
		int col = sc.nextInt();
		
		for(int i=1;i<=row;i++){
			int num = 4;
			for(int j=1;j<=col;j++){
				System.out.print("C"+""+num-- + " " );
			}
			System.out.println();
		}
	}
}
