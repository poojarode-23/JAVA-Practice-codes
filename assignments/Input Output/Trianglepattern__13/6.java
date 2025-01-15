import java.util.*;
class Trianglepattern6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rows:");
		int row = sc.nextInt();
	
		System.out.print("Enter columns:");
		int col = sc.nextInt();
		
		
	
		for(int i=row;i>=1;i--){
			char ch1 = 'a';
			int num = 1;
			for(int j=1;j<=i;j++){
				if(j%2==0){
					
					System.out.print(ch1++ +"\t");
				}
				else{
					System.out.print(num++ +"\t");
				}
			}
			
			System.out.println();
		}
	}
}
