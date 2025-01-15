import java.io.*;
class IODemo9{
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter math marks:");
		int math = Integer.parseInt(br.readLine());
		
		System.out.print("enter english marks:");
		int english = Integer.parseInt(br.readLine());
		
		System.out.print("enter science marks:");
		int science = Integer.parseInt(br.readLine());
		
		System.out.print("enter marathi marks:");
		int marathi = Integer.parseInt(br.readLine());
		
		int sum = 0;
		sum = math+english+marathi+science;
		System.out.println(sum +" out of 400");
	}
}
		
		
