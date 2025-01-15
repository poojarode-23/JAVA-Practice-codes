import java.io.*;
class JaggedArray2{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter size:");
		int size = Integer.parseInt(br.readLine());
		int arr[]  = new int[size];
		
		System.out.println("Enetr elements:");
			for(int i=0;i<size;i++){
				arr[i] = Integer.parseInt(br.readLine());
			}
			for(int i=0;i<size;i++){
				System.out.println(arr[i]);
			}
		}
	}

