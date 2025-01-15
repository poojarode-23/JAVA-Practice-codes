class IDemo{
 	public static void main(String[] args){
 	
 		char ch = 97;
 		
 		if (ch == 'a'){
 			System.out.println(ch-- + x);
 		}
 		else{
 		   	System.out.println(ch++)
 		}
 		else{
 			System.out.println("Hello!!!");
 		}
 		System.out.println(ch+=5);
 	}
 }
 			
 			
 			
/*java:10: error: ';' expected
 		   	System.out.println(ch++)
 		   	                        ^
6.java:12: error: 'else' without 'if'
 		else{
 		^
2 errors

*/
