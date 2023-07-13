class AC{
	static String name="LG";
	static int minTemp=10;
	static int maxTemp=30;
	static int currentTemp=15;
	static boolean isPoweredOn;
	public static boolean onOrOff(){
		System.out.println("Invoking onOrOff()");
		if(isPoweredOn==false){
			isPoweredOn=true;
			System.out.println("AC is on enjoy");
	}
	     else if(isPoweredOn==true){
	     	isPoweredOn=false;
	     	System.out.println("AC is off enjoy");
	     }
	     return isPoweredOn;
		}
		public static void increaseTemp(){
           if(isPoweredOn==true){
           	if(currentTemp<maxTemp){
           		currentTemp++;
           		System.out.println("The Current Temperature is "+currentTemp);
           	}
           	else {
           		System.out.print("The Temperature is max");
           	}
           }
           else {
           	System.out.println("The AC is not on...");
           }
		}
public static void decreaseTemp(){
          if(isPoweredOn==true){
          	if(currentTemp>minTemp){
          		currentTemp--;
          		System.out.println("the current Temperature is "+currentTemp);
          	}
          	else{
          		System.out.println("the Temperature is already minimum");
          	}
          }
          else {
          	System.out.println("The AC is not on...");
          }
		}
}