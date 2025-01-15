import java.util.*;
class Pattern7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rows:");
		int row = sc.nextInt();
	
		System.out.print("Enter columns:");
		int col = sc.nextInt();
		
		int num = 2;
		for(int i=row;i>=1;i--){
			for(int j=1;j<=i;j++){
				if(num%2==0){
				System.out.print(num +" ");
				}
				num++;
			}
			
			System.out.println();
		}
	}
}
