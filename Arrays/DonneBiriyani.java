class DonneBiriyani{
	static String nonVegMenuItems[]={"Chicken Biriyani","Kushka","Mutton Biriyani","Chilli Chicken","Chicken Fry","Kabab","BBQ Chicken","Hyderabadi Biriyani","Handi Biriyani","Lemon Chicken","Pepper Chicken","Chicken Ghee Roast"};
	static String vegMenuItems[]={"Dose","Idly","Vade","Gobi Manchuri","Noodles","Paneer Manchuri","Gobi Chilly","Paneer Chilly","Paneer Tikka","Gobi 65","Baby Corn Manchurian","Masala Dose","Tea","Veg Biriyani","Tomato Soup"}; 
	public static void main(String bro[])
	{
int nonlen=nonVegMenuItems.length();
int veglen=nonVegMenuItems.length();
System.out.println("Veg menu items");
for (int i=0;i<nonlen;i++ ) {
	System.out.println(vegMenuItems[i]);
}
System.out.println("Non Veg Menu Items");
for (i=0;i<veglen ;i++ ) {
	System.out.println(nonVegMenuItems[i]);
}


}
}