class Number2{
	public static void main(String[] args){
		char ch = 'A';
		for(int i=9;i>=1;i--){
			if(i%2==0){
				System.out.print(ch+" ");
			}
			else{
				System.out.print(i+" ");
			}
			ch++;
		}
		System.out.println();
	}
}
