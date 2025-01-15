import java.io.*;
class IODemo1{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enetr age:");
		int age = Integer.parseInt(br.readLine());
		
		if(age>=18){
			System.out.println("Voter is eligible");
		}
		else if(age<0){
			System.out.println("Input is invalid");
		}
		else{
			System.out.println("voter is not eligible");
		}
	}
} 
		
