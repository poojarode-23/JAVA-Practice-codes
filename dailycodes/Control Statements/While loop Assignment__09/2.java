class WhileDemo2{
	public static void main(String[] args){
		int num = 2569185;
		
		while(num>0){
			num/=10;
			int digit = 0;
			digit = digit+num;
			if(digit%3 ==1){
				System.out.println(digit);
			}
			num%=10;
		}
	}
}
