class program7{

	public static void main(String [] args){
	
		int selling_price = 300;
		int cost_price = 500;
		
		if(selling_price>cost_price){
		
			System.out.println("Profit of "+(selling_price-cost_price));
			
		}else if(selling_price<cost_price){
		
			System.out.println("Loss of "+(cost_price-selling_price));
		}else{
		
			System.out.println("no loss no profit");
		}
	}
}