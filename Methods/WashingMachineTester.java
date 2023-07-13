class WashingMachineTester{
	public static void main(String[] args) {
		Oven.onOrOff();
		Oven.setTimer(50);
		Oven.decreaseTimer();
		Oven.increaseTimer();
		Oven.onOrOff();
		Oven.setTimer(45);
		Oven.decreaseTimer();
		Oven.increaseTimer();
	}
}