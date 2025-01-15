import java.util.*;
class Trianglepattern9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rows:");
		int row = sc.nextInt();

		System.out.print("Enter columns:");
		int col = sc.nextInt();
	
		int num = 30;
		for(int i=row;i>=1;i--){
			
			for(int j=1;j<=i;j++){
				
				if(num%2==1){
					System.out.print(num-- +" ");
				}
				num--;
			}
			System.out.println();
		}
	}
}
