class JvmInetrnal4{
	public static void main(String[] args){
		char  ch1 = 'A';
		char ch2 = 'a'; 
		char ch3 = 'B';
		
		int a = 65; 
		int b = 97;
		int c = 66;
		
		System.out.println(System.identityHashCode(ch1));
		System.out.println(System.identityHashCode(ch2));
		System.out.println(System.identityHashCode(ch3));
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		
	}
}
