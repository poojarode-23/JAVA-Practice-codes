class Ifelse7{
	public static void main(String[] args){
		int costPrice = 1200;
		int sellingPrice = 1500;
		
		int profit = sellingPrice-costPrice;
		
		if(profit>0){
			System.out.println("Profit of "+profit);
		}
		else{
			System.out.println("loss of "+profit);
		}
	}
}

