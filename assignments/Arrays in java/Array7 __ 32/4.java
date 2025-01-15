import java.util.*;

class ArrayDemo4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter rows and columns:");
		 int row = sc.nextInt();
		 int col = sc.nextInt();
		 
		 int arr[][] = new int[row][col];
		 
		 System.out.println("Elements of array:");
		 for(int i=0;i<row;i++){
		 	for(int j=0;j<col;j++){
		 		arr[i][j] = sc.nextInt();
		 	}
		 }
		 
		 for(int i=0;i<row;i++){
		 	int sum = 0;
		 	for(int j=0;j<col;j++){
		 		if(j%2==0){
		 			sum=+arr[i][j];
		 		}
		 	}
		 	System.out.println(sum);
		 	System.out.println();
		 }
	}
} 
