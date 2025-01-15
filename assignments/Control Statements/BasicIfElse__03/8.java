class Basicif8{
	public static void main(String[] args){
		int num = 10;
		if(num%2==0 && num%5==0 && num%10==0){
			System.out.println(num +"is divisible by 2,5,10");
		}
		else{
			System.out.println(num +"is not divisibale by 2,5,10");
		}
		int num1 = 15;
		if(num1%2==0 && num%5==0 && num%10==0){
			System.out.println(num1 +  "is divisible by 2,5,10");
		}
		else{
			System.out.println(num1+ "is not divisible by 2,5,10");
		}

	}
}
