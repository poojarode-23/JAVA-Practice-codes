import java.util.*;
class Pattern3{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("enter rows:");
		int row = sc.nextInt();
		System.out.print("Enter columns:");
		int col = sc.nextInt();
		
		for(int i=1;i<=row;i++){
			char ch = 'D';
			for(int j=1;j<=col;j++){
				if(i%2==1){
				System.out.print(ch-- + " " );
				}
				else{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}
