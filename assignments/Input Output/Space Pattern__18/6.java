import java.util.*;
class PatternDemo6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rows:");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++){
			int num=3;
			for(int j=1;j<=i;j++){ 
				System.out.print(" " +" ");
			
			}
			for(int k=row;k<=1;k--){
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
