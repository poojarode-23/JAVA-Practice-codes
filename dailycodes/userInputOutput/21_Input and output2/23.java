import java.io.*;
class InputDemo10{
	public static void main(String[] args)throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		String name = br.readLine();
		System.out.println("Name:"+name);
		
		String compName = br.readLine();
		System.out.println("Company Name:"+compName);
		
		String empName = br.readLine();
		System.out.println("Employee Name:"+empName);
		
		System.out.println("Name:"+name);
		System.out.println("Company name:"+compName);
		System.out.println("Employee name:"+empName);
		
	}
}
