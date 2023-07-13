class TravelAgency{
static String touristPlaces[]={null,null,null,null,null,null,null,null};
static int index;
public static void getTouristPlaces(){
  String reference="";
   for(int i=0;i<touristPlaces.length;i++){
     reference= touristPlaces[i];
    System.out.println(reference+" At position "+i);
   }
}
public static void addTouristPlaces(String newData){
    if(newData!=null){
	     touristPlaces[index++]=newData;
}
    else System.out.println("Cannot add , as it is already null");
}
public static void updateTouristPlaceNames(String oldname, String newname ){
  for(int i =0; i<touristPlaces.length;i++){
    if(touristPlaces[i]==oldname){
      touristPlaces[i]=newname;
      System.out.println("Updated "+oldname+" to "+newname+" at index "+i);
    }
  }
}
public static void deletePlaces(String deleteName){
  int i,j;
  boolean elementFound=false;
  for(i=0;i<touristPlaces.length;i++){
    if(touristPlaces[i]==deleteName){
      elementFound=true;
      break;
    }
  }
 if(elementFound==true){
  for(j=i;j<touristPlaces.length-1;j++){
        touristPlaces[j]=touristPlaces[j+1];
      }
      touristPlaces[j]=null;
     --index;
      System.out.println("The new number of elements is"+index);
    }
    else System.out.println("element not found");
}
}