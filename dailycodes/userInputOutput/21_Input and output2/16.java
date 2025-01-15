import java.io.*;
class InputDemo4{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		
		int x = isr.read();
		System.out.println(x);
	}
}
