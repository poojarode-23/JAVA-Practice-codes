import java.io.*;
class InputDemo5{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		
		char x = isr.read();
		System.out.println(x);
	}
}
