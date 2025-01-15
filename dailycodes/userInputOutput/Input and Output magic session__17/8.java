import java.io.*;
class IODemo7{
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter num1:");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.print("enter num2:");
		int num2 = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=num1;i<=num2;i++){
			sum = sum+i;
		}
		System.out.println(sum);
	}
}
