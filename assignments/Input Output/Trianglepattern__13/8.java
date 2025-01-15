import java.util.*;
class Trianglepattern8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rows:");
		int row = sc.nextInt();

		System.out.print("Enter columns:");
		int col = sc.nextInt();
		char ch = 'D';
		int num = 5;
		for(int i=row;i>=1;i--){
			
			for(int j=1;j<=i;j++){
				
				if(i%2==0){
					
					System.out.print(ch-- +"\t");
				}
				else{
					System.out.print(num-- +"\t");
				}
			}
			num = i-1;
			System.out.println();
		}
	}
}
