class Mixer{
	static String name="Kailash";
	static int minSpeed=0;
	static int maxSpeed=3;
	static int currentSpeed;
	static boolean isPoweredOn;
	public static boolean onOrOff(){
		System.out.println("Invoking onOrOff()");
		if(isPoweredOn==false){
			isPoweredOn=true;
			System.out.println("Kailash Mixer...");
			System.out.println("Mixer is on enjoy");
	}
	     else if(isPoweredOn==true){
	     	isPoweredOn=false;
	     	currentSpeed=0;
	     	System.out.println("Mixer is off enjoy");
	     }
	     return isPoweredOn;
		}
		public static void increaseSpeed(){
           if(isPoweredOn==true){
           	if(currentSpeed<maxSpeed){
           		currentSpeed++;
           		System.out.println("The Current Speed is "+currentSpeed);
           	}
           	else {
           		System.out.print("The Speed is max");
           	}
           }
           else {
           	System.out.println("The Mixer is not on...");
           }
		}
public static void decreaseSpeed(){
          if(isPoweredOn==true){
          	if(currentSpeed>minSpeed){
          		currentSpeed--;
          		System.out.println("the current Speed is "+currentSpeed);
          	}
          	else{
          		System.out.println("the Speed is already minimum");
          	}
          }
          else {
          	System.out.println("The Mixer is not on...");
          }
		}
}