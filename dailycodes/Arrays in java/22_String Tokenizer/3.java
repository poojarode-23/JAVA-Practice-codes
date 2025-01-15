import java.io.*;
class InputDemo3{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name:");
		String name = br.readLine();
		
		System.out.println("Enter society name:");
		String socname = br.readLine();
		
		System.out.println("Enter wing:");
		char wing = br.readLine();
		
		System.out.println("Enter flat No:");
		String flatno = br.readLine();
		
	}
}
		
