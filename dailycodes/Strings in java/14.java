class StringDemo14{
	public static void main(String[] args){
		String str1 = "shashi";
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
		
		String str2 = "shashi";
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));
		
		String str3 = new String("shashi");
		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));
		
		
		
	}
}