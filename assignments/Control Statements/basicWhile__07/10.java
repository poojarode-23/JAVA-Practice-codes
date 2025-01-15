class BasicWhile10{
	public static void main(String[] args){
		int i = 100;
		while(i>=10){
			if(i%4==0 && i%5==0){
				System.out.println(i);
			}
			i--;
		}
	}
}
