class IfElse4{
	public static void main(String[] args){
		float per = 85.0f;
		if(per>85){
			System.out.println("Medical");
		}
		else if(per<=85.0&&per>=75.0){
			System.out.println("Engineering");
		}
		else if(per<=75.0&& per>=65.0){
			System.out.println("Pharmacy");
		}
		else{
			System.out.println("BSc");
		}
	}
}
