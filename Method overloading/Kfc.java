class Kfc{
	public static double search(String foodName){
		if(foodName=="Veg Zinger"){
			System.out.println("The Food is "+foodName);
			return 130.0;
		}
        if(foodName=="Chicken Zinger"){
			System.out.println("The Food is "+foodName);
			return 150.0;
		}
        if(foodName=="Krunchy Burger"){
			System.out.println("The Food is "+foodName);
			return 160.0;
		}
        if(foodName=="Rice Bowl Veg"){
			System.out.println("The Food is "+foodName);
			return 165.0;
		}
        if(foodName=="Rice Bowl NOn Veg"){
			System.out.println("The Food is "+foodName);
			return 200.0;
		}
        if(foodName=="Hot Chicken"){
			System.out.println("The Food is "+foodName);
			return 185.0;
		}
        if(foodName=="Crispy Chicken"){
			System.out.println("The Food is "+foodName);
			return 360.0;
		}
        if(foodName=="Smoky Grilled Chicken"){
			System.out.println("The Food is "+foodName);
			return 525.0;
		}
        if(foodName=="Bucket Chicken"){
			System.out.println("The Food is "+foodName);
			return 630.0;
		}
        if(foodName=="Triple Treat"){
			System.out.println("The Food is "+foodName);
			return 456.0;
		}
        if(foodName=="Burger Chicken"){
			System.out.println("The Food is "+foodName);
			return 112.0;
		}
        if(foodName=="Veg Bruger Meal"){
			System.out.println("The Food is "+foodName);
			return 125.0;
		}
        if(foodName=="Pepsi"){
			System.out.println("The Food is "+foodName);
			return 45.30;
		}
        if(foodName=="Coke"){
			System.out.println("The Food is "+foodName);
			return 12.0;
		}
        if(foodName=="Fried Chicken"){
			System.out.println("The Food is "+foodName);
			return 145.0;
		}
        if(foodName=="Wings"){
			System.out.println("The Food is "+foodName);
			return 123.0;
		}
        if(foodName=="Veg Paneer Wrap"){
			System.out.println("The Food is "+foodName);
			return 156.0;
		}
        if(foodName=="Veg Spicy Wrap"){
			System.out.println("The Food is "+foodName);
			return 145.0;
		}
        if(foodName=="Chicken Wrap"){
			System.out.println("The Food is "+foodName);
			return 145.0;
		}
        if(foodName=="Spicy Chicken Wrap"){
			System.out.println("The Food is "+foodName);
			return 140.0;
		}
        
        System.out.println(foodName+" is not available");
		return 0.0;
	}
    public static double search(String foodName, int quantity){
        if(foodName=="Veg Zinger"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 130.0;
        }
        if(foodName=="Chicken Zinger"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 150.0;
        }
        if(foodName=="Krunchy Burger"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 160.0;
        }
        if(foodName=="Rice Bowl Veg"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 165.0;
        }
        if(foodName=="Rice Bowl NOn Veg"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 200.0;
        }
        if(foodName=="Hot Chicken"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 185.0;
        }
        if(foodName=="Crispy Chicken"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 360.0;
        }
        if(foodName=="Smoky Grilled Chicken"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 525.0;
        }
        if(foodName=="Bucket Chicken"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 630.0;
        }
        if(foodName=="Triple Treat"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 456.0;
        }
        if(foodName=="Burger Chicken"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 112.0;
        }
        if(foodName=="Veg Bruger Meal"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 125.0;
        }
        if(foodName=="Pepsi"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 45.00;
        }
        if(foodName=="Coke"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 12.0;
        }
        if(foodName=="Fried Chicken"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 145.0;
        }
        if(foodName=="Wings"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 123.0;
        }
        if(foodName=="Veg Paneer Wrap"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 156.0;
        }
        if(foodName=="Veg Spicy Wrap"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 145.0;
        }
        if(foodName=="Chicken Wrap"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 145.0;
        }
        if(foodName=="Spicy Chicken Wrap"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 140.0;
        }
        
        System.out.println(foodName+" is not available");
        return  0.0;
    }
}
