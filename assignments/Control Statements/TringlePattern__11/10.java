import java.io.*;
class c2w10{
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter rows:");
		int row = Integer.parseInt(br.readLine());
		
		char ch = 'a'; 
		for(int i=1;i<=row;i++){
			int num = 1;
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print(ch + " ");
				}
				else{
					System.out.print(num++ + " ");
				}
			ch++;
			}
			System.out.println();
		}
	}
}
		
		
