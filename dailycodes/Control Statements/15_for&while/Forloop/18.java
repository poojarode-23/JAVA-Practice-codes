class BreakDemo5{
	public static void main(String[] args){
		for(int i=1;i<=50;i++){
			if(i%3==0 && i%5==0){
				continue;
			}
			System.out.println(i);
		}
	}
}

