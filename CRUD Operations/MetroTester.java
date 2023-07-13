class MetroTester{
public static void main(String[] args) {
	Metro.addStationNames("Rajaji Nagar");
	Metro.addStationNames("Yeshwantpura");
	Metro.addStationNames("Jalhalli");
	Metro.addStationNames("Dasrhalli");
	Metro.addStationNames("Peenya");
	Metro.addStationNames("Sandal Soap Factory");
	Metro.addStationNames("Mantri Square");
	Metro.getStationNames();
	Metro.updateStationNames("Peenya","Peenya Industry");
}

}