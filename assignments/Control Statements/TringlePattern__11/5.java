import java.io.*;
class c2w5{
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter rows:");
		int row = Integer.parseInt(br.readLine());
		
		char ch = 'D';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}
}
		
		
