class Speaker{
	static String name="JBL";
	static int minVolume;
	static int maxVolume=10;
	static int currentVolume;
	static boolean isConnected;
	public static boolean onOrOff(){
		System.out.println("Invoking onOrOff()");
		if(isConnected==false){
			isConnected=true;
			System.out.println("Speaker is on enjoy");
	}
	     else if(isConnected==true){
	     	isConnected=false;
	     	System.out.println("Speaker is off enjoy");
	     }
	     return isConnected;
		}
		public static void increaseVolume(){
           if(isConnected==true){
           	if(currentVolume<maxVolume){
           		currentVolume++;
           		System.out.println("The Current volume is "+currentVolume);
           	}
           	else {
           		System.out.print("The Volume is max");
           	}
           }
           else {
           	System.out.println("The Speaker is not on...");
           }
		}
public static void decreaseVolume(){
          if(isConnected==true){
          	if(currentVolume>minVolume){
          		currentVolume--;
          		System.out.println("the current volume is "+currentVolume);
          	}
          	else{
          		System.out.println("the volume is already minimum");
          	}
          }
          else {
          	System.out.println("The speaker is not on...");
          }
		}
}