import java.util.*;
class Pattern4{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("enter rows:");
		int row = sc.nextInt();
		System.out.print("Enter columns:");
		int col = sc.nextInt();
		int num = 4;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num*j + " " );
			}
			num = row-i;
			System.out.println();
		}
	}
}
