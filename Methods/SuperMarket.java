class SuperMarket{

public static void main(String bro[])
{
//to pass local variabes array into the functions.
 String vegetables[]={"Potato","Tomato","Onion","Carrot","Brinjal"};
 String biscuits[]={"Oreo","Parle G","Marie Gold","Bourbon","Milk Bikies","Hide and Seek","Sunfeast Bounce","Dark Fantasy","Monaco","Tiger"};
 String perfumes[]={"Axe","Nivia","Nike","Puma","KS","VILLIAN","wild Stone","Fogg","CK","Brut"};
 String grocery[]={"Rice","Sauce-tomato","dal","Wheat","flour","ragi","spices","Oil","Egg","Cheese"};

getVegetables(vegetables);
getBiscuits(biscuits);
getPerfumes(perfumes);
getGrocery(grocery);
}
public static void getVegetables(String vegetables[])
{
    for (String veg :vegetables ) {
        System.out.println(veg);
    }
}
public static void getBiscuits(String biscuits[]){
    for (String bis :biscuits ) {
        System.out.println(bis);
    }
}
public static void getPerfumes(String perfumes[]){
    for (String per :perfumes ) {
        System.out.println(per);
    }
}
public static void getGrocery(String grocery[]){
    for (String gro :grocery ) {
        System.out.println(gro);
    }
}
}