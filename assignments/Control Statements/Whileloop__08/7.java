class Whileloop7{
	public static void main(String[] args){
		int num = 93079224;
		int count=0;
		while(num!=0){
			count++;
			num/=10;
		}
		System.out.println(count);
		System.out.println(num);
	}
}
				
