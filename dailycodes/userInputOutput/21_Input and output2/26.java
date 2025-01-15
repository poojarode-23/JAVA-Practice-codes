import java.io.*;
class InputDemo12{
	public static void main(String[] args)throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
	
		System.out.println("Enter company name:");
		String compName = br.readLine();
		
		System.out.println("Employee Name:");
		String empName = br.readLine();
		
		System.out.println("Employee Id:");
		int empId = Integer.parseInt(br.readLine());
		
		System.out.println("Employee network:");
		float empNet = Float.parseFloat(br.readLine());
		
		System.out.println("Employee salary:");
		double empsal = Double.parseDouble(br.readLine());
		
		

		System.out.println("Company name:"+compName);
		System.out.println("Employee name:"+empName);
		System.out.println("Employee Id:"+empId); 
		System.out.println("Employee Network:"+empNet);
		System.out.println("Employee salary:"+empsal);
		
	}
}
