class Logical3{
	public static void main(String[] args){
		boolean x = 10;
		boolean y = 32;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
	}
}
		
/*13.java:3: error: incompatible types: int cannot be converted to boolean
		boolean x = 10;
		            ^
13.java:4: error: incompatible types: int cannot be converted to boolean
		boolean y = 32;
		            ^
2 errors
*/
