class ZomatoTester{
	public static void main(String[] args) {
		double priceOfFood;
		String food="Pizza";
		priceOfFood=Zomato.search(food);
        System.out.println("The Price of "+food+" is "+priceOfFood);
        food="Shawarma";
		priceOfFood=Zomato.search(food);
        System.out.println("The Price of "+food+" is "+priceOfFood);
        food="Russian";
		priceOfFood=Zomato.search(food);
        System.out.println("The Price of "+food+ "is "+priceOfFood);
	}
}
