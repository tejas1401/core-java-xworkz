class MedicalStore{
static String medicineNames[]={null,null,null,null,null,null,null,null,null};
static int index;
public static void getMedicineNames(){
  String reference="";
   for(int i=0;i<medicineNames.length;i++){
     reference= medicineNames[i];
    System.out.println(reference+" At position "+i);
   }
}
public static void addMedicineNames(String newData){
    if(newData!=null){
	     medicineNames[index++]=newData;
}
    else System.out.println("Cannot add , as it is already null");
}
public static void updateMedicineNames(String oldname, String newname ){
  for(int i =0; i<medicineNames.length;i++){
    if(medicineNames[i]==oldname){
      medicineNames[i]=newname;
      System.out.println("Updated "+oldname+" to "+newname+" at index "+i);
    }
  }
}
public static void deleteMedicine(String deleteName){
  int i,j;
  boolean elementFound=false;
  for(i=0;i<medicineNames.length;i++){
    if(medicineNames[i]==deleteName){
      elementFound=true;
      break;
    }
  }
 if(elementFound==true){
  for(j=i;j<medicineNames.length-1;j++){
        medicineNames[j]=medicineNames[j+1];
      }
      medicineNames[j]=null;
     --index;
      System.out.println("The new number of elements is"+index);
    }
    else System.out.println("element not found");
}
}