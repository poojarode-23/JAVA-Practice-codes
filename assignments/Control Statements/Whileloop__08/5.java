class Whileloop5{
	public static void main(String[] args){
		int i=1;
		int num=1;
		while(i<=4){
			int j=1;
			while(j<=4){
				System.out.print(num++ +" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}	
}
