class KarnatakaTester{
	public static void main(String[] args) {
		Karnataka.addCityNames("Bangalore");
		Karnataka.addCityNames("Mysore");
		Karnataka.addCityNames("Davangere");
		Karnataka.addCityNames("Chitradurga");
		Karnataka.addCityNames("Tumkur");
		Karnataka.addCityNames("Mangaluru");
		Karnataka.addCityNames("Mangaluru");//to catch out of bounds
		Karnataka.getCityNames();
        Karnataka.updateCityNames("Bangalore","Bengaluru");
	}
}