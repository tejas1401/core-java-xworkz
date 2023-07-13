class McDonalds{
	public static double search(String foodName){
		if(foodName=="Mc Aloo Tikki"){
			System.out.println("The Food is "+foodName);
			return 30.0;
		}
		if(foodName=="Pizza Puff"){
			System.out.println("The Food is "+foodName);
			return 25.0;
		}
		if(foodName=="Mc Aloo Tikki Meal"){
			System.out.println("The Food is "+foodName);
			return 175.0;
		}
		if(foodName=="Big Mac Meal"){
			System.out.println("The Food is "+foodName);
			return 224.0;
		}
		if(foodName=="Coke Float"){
			System.out.println("The Food is "+foodName);
			return 50.0;
		}
		if(foodName=="Peri Peri French Fries"){
			System.out.println("The Food is "+foodName);
			return 100.0;
		}
		if(foodName=="Spicy Big Mac"){
			System.out.println("The Food is "+foodName);
			return 110.0;
		}
		if(foodName=="Fanta Float"){
			System.out.println("The Food is "+foodName);
			return 35.0;
		}
		if(foodName=="Softie"){
			System.out.println("The Food is "+foodName);
			return 30.0;
		}
		if(foodName=="Happy Meal"){
			System.out.println("The Food is "+foodName);
			return 150.0;
		}
		if(foodName=="Chicken McGrill"){
			System.out.println("The Food is "+foodName);
			return 126.0;
		}
		if(foodName=="Mc Egg"){
			System.out.println("The Food is "+foodName);
			return 118.0;
		}
		if(foodName=="Aloo Wrap"){
			System.out.println("The Food is "+foodName);
			return 75.0;
		}
		if(foodName=="Veg Wrap"){
			System.out.println("The Food is "+foodName);
			return 65.0;
		}
		if(foodName=="Egg Wrap"){
			System.out.println("The Food is "+foodName);
			return 60.0;
		}
		if(foodName=="Big Spicy Chicken Wrap"){
			System.out.println("The Food is "+foodName);
			return 175.0;
		}
		if(foodName=="Big spicy Paneer Wrap"){
			System.out.println("The Food is "+foodName);
			return 150.0;
		}
		if(foodName=="Chicken McNuggets"){
			System.out.println("The Food is "+foodName);
			return 110.0;
		}
		if(foodName=="Mc Flurry Oreo"){
			System.out.println("The Food is "+foodName);
			return 110.0;
		}
		if(foodName=="Ice Tea"){
			System.out.println("The Food is "+foodName);
			return 50.0;
		}
		
        System.out.println(foodName+" is not available");
		return 0.0;
	}
	
    public static double search(String foodName,int quantity){
        if(foodName=="Mc Aloo Tikki"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 30.0;
        }
        if(foodName=="Pizza Puff"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 25.0;
        }
        if(foodName=="Mc Aloo Tikki Meal"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 175.0;
        }
        if(foodName=="Big Mac Meal"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 224.0;
        }
        if(foodName=="Coke Float"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 50.0;
        }
        if(foodName=="Peri Peri French Fries"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 100.0;
        }
        if(foodName=="Spicy Big Mac"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 110.0;
        }
        if(foodName=="Fanta Float"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 35.0;
        }
        if(foodName=="Softie"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 30.0;
        }
        if(foodName=="Happy Meal"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 150.0;
        }
        if(foodName=="Chicken McGrill"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 126.0;
        }
        if(foodName=="Mc Egg"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 118.0;
        }
        if(foodName=="Aloo Wrap"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 75.0;
        }
        if(foodName=="Veg Wrap"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 65.0;
        }
        if(foodName=="Egg Wrap"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 60.0;
        }
        if(foodName=="Big Spicy Chicken Wrap"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 175.0;
        }
        if(foodName=="Big spicy Paneer Wrap"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 150.0;
        }
        if(foodName=="Chicken McNuggets"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 110.0;
        }
        if(foodName=="Mc Flurry Oreo"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 110.0;
        }
        if(foodName=="Ice Tea"){
            System.out.println("The Food is "+foodName+"\nQuantity:"+quantity);
            return quantity* 50.0;
        }
        
        System.out.println(foodName+" is not available");
        return quantity* 0.0;
    }

}