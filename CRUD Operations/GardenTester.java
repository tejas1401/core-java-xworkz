class GardenTester{
	public static void main(String[] args) {
		Garden.addFlowerNames("Rose");
		Garden.addFlowerNames("Jasmine");
		Garden.addFlowerNames("Lotus");
		Garden.addFlowerNames("Tulip");
		Garden.getFlowerNames();
		Garden.updateFlowerNames("Rose","Rose flower");
		System.out.println("after updating element");
		Garden.getFlowerNames();
		Garden.deleteFlower("Rose flower");
		System.out.println("rose id deleted");
		Garden.deleteFlower("bruh");
		System.out.println("after deleting element");
		Garden.getFlowerNames();
		Garden.searchInArray("Tulip");
		Garden.searchInArray("Lilly");
		Garden.searchInArray("new flower");



	}
}
