import java.io.*;
class IODemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enetr number:");
		int num = Integer.parseInt(br.readLine());
		if(num%2==0){
			System.out.println(num+ " is an even no");
		}
		else{
			System.out.println(num+" is an odd no");
		}
	}
}
