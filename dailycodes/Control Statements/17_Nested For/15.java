class NestedDemo14{
	public static void main(String[] args){
		int num = 1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=4;j++){
				if(i%2==0){
					System.out.print((char)(num+64) +" ");
				}
				else{
					System.out.print(num+" ");
				}
			num++;	
			}
		System.out.println();
		}
	}
}
	
