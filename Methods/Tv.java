class Tv{
	static String name="Micromax";
	static int minVolume=0;
	static int maxVolume=100;
	static int currentVolume;
	static boolean isPoweredOn;
	static int currentChannel=25;
	public static boolean onOrOff(){
		System.out.println("Invoking onOrOff()");
		if(isPoweredOn==false){
			isPoweredOn=true;
			System.out.println("Micromax TV...");
			System.out.println("TV is on enjoy");
	}
	     else if(isPoweredOn==true){
	     	isPoweredOn=false;
	     	System.out.println("TV  is off enjoy, and goofbye");
	     }
	     return isPoweredOn;
		}
		public static void increaseVolume(){
           if(isPoweredOn==true){
           	if(currentVolume<maxVolume){
           		currentVolume++;
           		System.out.println("The Current Volume is "+currentVolume);
           	}
           	else {
           		System.out.print("The Volume is max");
           	}
           }
           else {
           	System.out.println("The TV is not on...");
           }
		}
public static void decreaseVolume(){
          if(isPoweredOn==true){
          	if(currentVolume>minVolume){
          		currentVolume--;
          		System.out.println("the current Volume is "+currentVolume);
          	}
          	else{
          		System.out.println("the Volume is already minimum");
          	}
          }
          else {
          	System.out.println("The TV is not on...");
          }
		}
public static void changeChannel(int chno){
	if(chno>0&&chno<=100){
		currentChannel=chno;
	System.out.println("The Current Channel is "+currentChannel);
	}
	else {
		System.out.println("Invalid Channel No.");
	}
}
public static void channelUp(){
	if(isPoweredOn==true){
		if(currentChannel<100){
	currentChannel++;
	System.out.println("The Current Channel is "+currentChannel);		
	}
	else{
		System.out.println("This is the last channel");
	}
	}
	else {
		System.out.println("Turn on the Tv");
	}
}
public static void channelDown(){
	if(isPoweredOn==true){
		if(currentChannel>1){
	currentChannel--;
	System.out.println("The Current Channel is "+currentChannel);		
	}
	else{
		System.out.println("This is the First channel");
	}
	}
	else {
		System.out.println("Turn on the Tv");
	}
}
}
