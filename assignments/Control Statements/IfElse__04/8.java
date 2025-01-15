class Ifelse8{
	public static void main(String[] args){
		float per = 85.0f;
		if(per>85){
			System.out.println("Passed:First class with distinction");
		}
		else if(per<=85.0&&per>=75.0){
			System.out.println("Passed:First class with distinction");
		}
		else if(per<=75.0&& per>=65.0){
			System.out.println("Passed:Second class");
		}
		else if(per>=35){
			System.out.println("Passed");
		}
		else{
			System.out.println("Failed");
		}
	}
}
