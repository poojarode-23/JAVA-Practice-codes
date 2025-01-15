import java.util.*;
class InputOutput11{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name:");
		String name = sc.next();
		
		System.out.print("Enter college name:");
		String clgname = sc.next();
		
		System.out.print("Enter student Id:");
		int studId = sc.nextInt();
		
		System.out.print("Enter CGPA:");
		float CGPA = sc.nextFloat();
		
		System.out.println("Student Name:"+name);
		System.out.println("College name:"+clgname);
		System.out.println("Id:"+studId);
		System.out.println("Marks:"+CGPA);
		
		
		
		}
}
