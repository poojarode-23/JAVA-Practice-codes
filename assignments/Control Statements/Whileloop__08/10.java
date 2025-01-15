class Whileloop10{
	public static void main(String[] args){
		long num = 9307922405l;
		long sum = 0;
		while(num>0){
			long digit = num%10;
			sum = sum+digit;
			num/=10;
		}
		System.out.println(sum);
	}
}
			
