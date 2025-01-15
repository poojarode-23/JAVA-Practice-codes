class Whileloop9{
	public static void main(String[] args){
		int num = 214367689;	
		int count1 = 0;
		int count2 = 0;
		while(num!=0){
			num/=10;
			if(num%2==0){
				count1++;
			}
			else{
				count2++;
			}
		}
		System.out.println(count1);
		System.out.println(count2);
	}
}
