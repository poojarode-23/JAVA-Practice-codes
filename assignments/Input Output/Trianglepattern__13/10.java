import java.util.*;
class Trianglepattern10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rows:");
		int row = sc.nextInt();
	
		System.out.print("Enter columns:");
		int col = sc.nextInt();
		
		char ch1 = 'E';
		for(int i=row;i>=1;i--){
			
			for(int j=1;j<=i;j++){
				
				if(i%2==1){
					
					System.out.print(ch1-- +"\t");
				}
				else{
					System.out.print((ch+32)-- +"\t");
				}
			}
			System.out.println();
		}
	}
}
