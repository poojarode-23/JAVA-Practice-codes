class forloop4{
	public static void main(String[] args){
		char ch = 65;
		for(int i=1;i<=10;i++){
			if(ch%2==0){
				System.out.print(ch + " ");
			}
			else{
				System.out.print(i+ " ");
			}
			ch++;
		}
		System.out.println();
	}
}