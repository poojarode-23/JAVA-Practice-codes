import java.util.*;
class InputDemo12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name:");
		String name = sc.next();
		
		System.out.println("enter society name:");
		String socname = sc.next();
		
		System.out.println("enter wing:");
		char wing = sc.next().charAt(0);
		
		System.out.println("enter flatNo:");
		int flatno = sc.nextInt();
		
		System.out.println("Name: "+name);
		System.out.println("Society Name: "+socname);
		System.out.println("Wing: "+wing);
		System.out.println("FlatNo: "+flatno);
		
	}
}
		
		
