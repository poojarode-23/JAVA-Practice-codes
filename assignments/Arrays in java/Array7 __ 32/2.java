import java.util.*;
class ArrayDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows and columns:");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int arr[][] = new int[row][col];
		
		System.out.println("Elements on an array:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr[i][j]+"\t");
				sum = sum+arr[i][j];
			}
			System.out.println();
		}
		System.out.println(sum);
	}
}
	
