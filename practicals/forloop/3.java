class forloop3{
	public static void main(String[] args){
		int num = 1;
		for(int i=1;i<=10;i++){
			if(num%2==0){
				System.out.print(num*num*num + " ");
			}
			else{
				System.out.print(num*num + " ");
			}
			num++;
		}
		System.out.println();
		
		
	}
}
	
