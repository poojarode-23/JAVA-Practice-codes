class Whileloop8{
	public static void main(String[] args){
		int num = 216985;
		while(num!=0){
			int digit = num%10;
			if(num%2==1){
				System.out.println(digit);
			}
			num/=10;
		}
	}
}
