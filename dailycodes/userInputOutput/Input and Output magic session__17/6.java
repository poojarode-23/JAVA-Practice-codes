import java.io.*;
class IODemo4{
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter num1:");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.print("enter num2:");
		int num2 = Integer.parseInt(br.readLine());
		
		for(int i=num1;i<=num2;i++){
			System.out.println(i);
		}
	}
}
