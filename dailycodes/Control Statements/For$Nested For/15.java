class Nestedfor5{
	public static void main(String[] args){
		int num = 3;
		for(int i=1;i<=3;i++){
		
			for(int j = 1;j<=3;j++){
				if(i%2==1){
					System.out.print(j +" ");
				}
				else{
					System.out.print(num--+" ");
				}
			}
			System.out.println();
		}
		
	}
}
