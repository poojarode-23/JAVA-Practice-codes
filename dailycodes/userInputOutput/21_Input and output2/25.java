import java.io.*;
class InputDemo11{
	public static void main(String[] args)throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
	
		System.out.println("Enter company name:");
		String compName = br.readLine();
		
		System.out.println("Employee Name:");
		String empName = br.readLine();
		
		System.out.println("Employee Id:");
		int empId = Integer.parseInt(br.readLine());

		System.out.println("Company name:"+compName);
		System.out.println("Employee name:"+empName);
		System.out.println("Employee Id:"+empId); 
		
	}
}
