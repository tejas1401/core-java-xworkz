class TravelAgencyTester{
public static void main(String[] args) {
    TravelAgency.addTouristPlaces("Nandi hills");
    TravelAgency.addTouristPlaces("Savandurga Hills");
    TravelAgency.addTouristPlaces("Mysore");
    TravelAgency.addTouristPlaces("Ooty");
    TravelAgency.addTouristPlaces("Pondicherry");
    TravelAgency.addTouristPlaces("Hyderabad");
    TravelAgency.addTouristPlaces("Delhi");
    TravelAgency.addTouristPlaces("Mumbai");
	TravelAgency.getTouristPlaces();
    TravelAgency.updateTouristPlaceNames("Mysore","Mysuru");
}
}