class Number3{
	public static void main(String[] args){
		char ch = 'A';
		for(int i=1;i<=10;i++){
			if(i%2==0){
				System.out.print(ch+" ");
			}
			else{
				System.out.print((char)(ch+32)+" ");
			}
			ch++;
		}
		System.out.println();
	}
}
