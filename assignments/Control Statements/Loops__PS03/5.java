class PrintNum{
	public static void main(String[] args){
		int num=23456;
		for(int i=1;i>0;i++){
			//if(i%2==0||i%3==0||i%4==0||i%5==0){
			if(num%2==0||num%3==0||num%4==0||num%5==0){
				continue;
			}
			if(num==100){
				break;
			}
			System.out.println(num+ " ");
		}
	}
}
