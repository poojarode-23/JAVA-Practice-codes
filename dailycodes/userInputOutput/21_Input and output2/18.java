import java.io.*;
class InputDemo5{
	public static void main(String[] args)throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		String name = br.readLine();
		System.out.println(name);
	}
}
