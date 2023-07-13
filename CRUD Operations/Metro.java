class Metro{
static String stationNames[]={null,null,null,null,null,null,null};
static int index;
public static void getStationNames(){
  String reference="";
   for(int i=0;i<stationNames.length;i++){
     reference= stationNames[i];
    System.out.println(reference+" At position "+i);
   }
}
public static void addStationNames(String newData){
    if(newData!=null){
	     stationNames[index++]=newData;
}
    else System.out.println("Cannot add , as it is already null");
}
public static void updateStationNames(String oldname, String newname ){
  for(int i =0; i<stationNames.length;i++){
    if(stationNames[i]==oldname){
      stationNames[i]=newname;
      System.out.println("Updated "+oldname+" to "+newname+" at index "+i);
    }
  }
}
public static void deleteStation(String deleteName){
  int i,j;
  boolean elementFound=false;
  for(i=0;i<stationNames.length;i++){
    if(stationNames[i]==deleteName){
      elementFound=true;
      break;
    }
  }
 if(elementFound==true){
  for(j=i;j<stationNames.length-1;j++){
        stationNames[j]=stationNames[j+1];
      }
      stationNames[j]=null;
     --index;
      System.out.println("The new number of elements is"+index);
    }
    else System.out.println("element not found");
}
}