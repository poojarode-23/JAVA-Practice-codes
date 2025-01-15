import java.io.*;
class InputDemo9{
	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name = br.readLine();
		System.out.println("Name:"+name);
		
		String compName = br.readLine();
		System.out.println("Company Name:"+compName);
		
	}
}
