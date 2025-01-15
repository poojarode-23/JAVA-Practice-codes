import java.io.*;
class c2w2{
	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("enetr rows:");
			int row = Integer.parseInt(br.readLine());
			
			char ch = 'a';
			for(int i=1;i<=row;i++){
				for(int j=1;j<=i;j++){
					if(i%2==1){
						System.out.print(ch++ + " ");
						
					}
					else{
						System.out.print("$" + " ");
					}
				}
				System.out.println();
			}
		}
	}
