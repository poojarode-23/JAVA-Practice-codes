class NestedDemo6{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			char ch = 'A';
			int num = 1;
			for(int j=1;j<=4;j++){
				System.out.print(num +""+ (char)ch +"  ");
				num++;
				ch++;
			}
			System.out.println();
		}
	}
}
