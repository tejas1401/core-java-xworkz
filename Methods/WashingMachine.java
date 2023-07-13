//Washing machine
class Oven{
	static String name="Washing machine";
	static int minTime=0;
	static int maxTime=1000;
	static int timer=0;
	static boolean isPoweredOn;
	public static boolean onOrOff(){
		System.out.println("Invoking onOrOff()");
		if(isPoweredOn==false){
			isPoweredOn=true;
			System.out.println("The awshing machine is on...");
			System.out.println(" enjoy");
	}
	     else if(isPoweredOn==true){
	     	isPoweredOn=false;
	     	timer=0;
	     	System.out.println("Washing machine is off enjoy, and goofbye");
	     }
	     return isPoweredOn;
		}
		public static void increaseTimer(){
           if(isPoweredOn==true){
           	if(timer<maxTime){
           		timer=timer+1;
           		System.out.println("The Current Time is "+timer+" sec");
           	}
           	else {
           		System.out.print("The timer is max");
           	}
           }
           else {
           	System.out.println("The washing machine  is not on...");
           }
		}
public static void decreaseTimer(){
          if(isPoweredOn==true){
          	if(timer>minTime){
          		timer=timer-1;
          		System.out.println("the current Timer is "+timer+" sec");
          	}
          	else{
          		System.out.println("the Timer is already minimum");
          	}
          }
          else {
          	System.out.println("The washing machine is not on...");
          }
		}
public static void setTimer(int tm){
	if(tm>0&&tm<=100){
		timer=tm;
	System.out.println("The Current Timer is "+timer+" sec");
	}
	else {
		System.out.println("Invalid time set");
	}
}
}
