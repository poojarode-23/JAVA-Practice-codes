import java.util.*;
class JaggedArray4{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enetr size of row and col:");
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		
		System.out.println("Enter Elemants:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
		 		arr[i][j] = sc.nextInt();
		 	}
		 }
		 System.out.println("Print elements:");
		 for(int i=0;i<row;i++){
		 	for(int j=0;j<col;j++){
		 		System.out.print(arr[i][j]+" ");
		 	}
		 	 System.out.println();
		 }
		 System.out.println(arr[1][1]);
		 System.out.println(arr[1]);
		 System.out.println(arr);
	}
}
	

