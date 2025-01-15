import java.io.*;
class c2w4{
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter rows:");
		int row = Integer.parseInt(br.readLine());
		
		char ch = 'c';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print((char)(ch-32) + " ");
				}
				else{
					System.out.print(ch + " ");
				}
			ch--;
			}
			System.out.println();
		}
	}
}
		
		
