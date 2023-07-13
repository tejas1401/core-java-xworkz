class Swiggy{
	public static double search(String foodName){
		if(foodName=="Green Salad"){
			System.out.println(""+foodName);
			return 50.0;
		}
		if(foodName=="Papad Fry"){
			System.out.println(""+foodName);
			return 45.0;
		}
		if(foodName=="Paneer Pakoda"){
			System.out.println(""+foodName);
			return 30.0;
		}
		if(foodName=="Egg Pakoda"){
			System.out.println(""+foodName);
			return 30.0;
		}
        if(foodName=="Chicken Pakoda"){
			System.out.println(""+foodName);
			return 50.0;
		}
        if(foodName=="Veg Manchurian"){
			System.out.println(""+foodName);
			return 100.0;
		}
        if(foodName=="Egg Curry"){
			System.out.println(""+foodName);
			return 100.0;
		}
        if(foodName=="Egg Omlette"){
			System.out.println(""+foodName);
			return 20.0;
		}
        if(foodName=="Lemon Rice"){
			System.out.println(""+foodName);
			return 35.0;
		}
        if(foodName=="Veg Thali"){
			System.out.println(""+foodName);
			return 120.0;
		}
        if(foodName=="Dal Fry"){
			System.out.println(""+foodName);
			return 90.0;
		}
        if(foodName=="Dal Thadka"){
			System.out.println(""+foodName);
			return 60.0;
		}
        if(foodName=="Gobi  Masala"){
			System.out.println(""+foodName);
			return 60.0;
		}
        if(foodName=="Veg Kofta"){
			System.out.println(""+foodName);
			return 100.0;
		}
        if(foodName=="Alu Dum"){
			System.out.println(""+foodName);
			return 140.0;
		}
        if(foodName=="Veg Hyderabadi"){
			System.out.println(""+foodName);
			return 150.0;
		}
        if(foodName=="Green Peas Masala"){
			System.out.println(""+foodName);
			return 110.0;
		}
        if(foodName=="Paneer Kofta"){
			System.out.println(""+foodName);
			return 120.0;
		}
        if(foodName=="Channa Masala"){
			System.out.println(""+foodName);
			return 90.0;
		}
        if(foodName=="Ice Cream Salad"){
			System.out.println(""+foodName);
			return 60.0;
		}
        System.out.println(foodName+" is not available");
		return 0.0;
	}
}