import java.io.*;
class c2w1{
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter rows:");
		int row = Integer.parseInt(br.readLine());
		
		int num = 9;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}

	
