class TelecomTester{
	public static void main(String[] args) {
		Telecom.addSim("JIO");
		Telecom.addSim("Airtel");
		Telecom.addSim("Vodafone");
		Telecom.addSim("Idea");
		Telecom.addSim("Tata");
		Telecom.getSim();
		Telecom.updateSimNames("Vodafone","Vodafone Idea");
	}
}