class Logical6{
	public static void main(String[] args){
		int x = 5;
		int y = 6;
		
		System.out.println((x-- > ++y) && (--x<++y));
		System.out.println((++x >= y--)||(++x <= -+y));
		System.out.println(x);
		System.out.println(y);
		} 
	}
		
