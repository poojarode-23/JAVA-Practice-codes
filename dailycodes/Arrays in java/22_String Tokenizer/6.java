import java.io.*;
class InputDemo6{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name:");
		String name = br.readLine();
		
		System.out.println("Enter society name:");
		String socname = br.readLine();
		
		System.out.println("Enter wing:");
		char wing = (char)br.read();
		
		System.out.println("Enter flat No:");
		int flatno = Integer.parseInt(br.readLine());
		
	}
}
		