class Karnataka{
static String cityNames[]={null,null,null,null,null,null};
static int index;
public static void getCityNames(){
  String reference="";
   for(int i=0;i<cityNames.length;i++){
     reference= cityNames[i];
    System.out.println(reference+" At position "+i);
   }
}
public static void addCityNames(String newData){
   if(index<cityNames.length){  // to catch out of bounds
        if(newData!=null){
	         cityNames[index++]=newData;
              }
    else System.out.println("Cannot add , as it is already null");
}
    else System.out.println("array is full");
  }
public static void updateCityNames(String oldname, String newname ){
  for(int i =0; i<cityNames.length;i++){
    if(cityNames[i]==oldname){
      cityNames[i]=newname;
      System.out.println("Updated "+oldname+" to "+newname+" at index "+i);
    }
  }
}
public static void deleteState(String deleteName){
  int i,j;
  boolean elementFound=false;
  for(i=0;i<cityNames.length;i++){
    if(cityNames[i]==deleteName){
      elementFound=true;
      break;
    }
  }
 if(elementFound==true){
  for(j=i;j<cityNames.length-1;j++){
        cityNames[j]=cityNames[j+1];
      }
      cityNames[j]=null;
     --index;
      System.out.println("The new number of elements is"+index);
    }
    else System.out.println("element not found");
}
}