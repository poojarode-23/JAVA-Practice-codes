class NestedDemo4{
	public static void main(String[] args){
		char ch = 'A';
		for(int i=1;i<=3;i++){
			for(int j=1;j<=6;j++){
				if(j%2==0){
					System.out.print(" ");
				}
				else{
					System.out.print(ch);
				}
			ch++;
			}
			System.out.println();
		}
	}
}
