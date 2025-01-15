class Pattern10{
	public static void main(String[] args){
	
		int num = 4563298;
		while(num!=0){
			int digit= 0;
			digit = num/10;
			if(digit%2==1){
				System.out.println(digit*digit +"\t");
			}
			num%=10;
		}
	}
}

