class WhileDemo1{
	public static void main(String[] args){
		int num = 2569185;
		while(num!=0){
			num/=10;
			int digit=0;
			digit = digit + num;
			num%=10;
			if(digit%2==0){
				System.out.println(digit);
			}
		}
	}
}
