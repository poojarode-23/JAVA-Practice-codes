import java.io.*;
class InputDemo9{
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
		
		System.out.println("Name:"+name);
		System.out.println("socname:"+socname);
		System.out.println("wing:"+wing);
		System.out.println("flatNo:"+flatno);
		
	}
}
		
