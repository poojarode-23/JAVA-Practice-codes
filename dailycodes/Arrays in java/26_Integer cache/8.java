class JvmInetrnal8{
	public static void main(String[] args){
		int x = 9;
		//char ch = '9'; 
		int  y = 9;
		
		System.out.println(System.identityHashCode(x));
		//System.out.println(System.identityHashCode(ch));
		System.out.println(System.identityHashCode(y));
		
		y = 20;
		System.out.println(System.identityHashCode(y));
	}
}
