class Telecom{
static String sim[]={null,null,null,null,null};
static int index;
public static void getSim(){
  String reference="";
   for(int i=0;i<sim.length;i++){
     reference= sim[i];
    System.out.println(reference+" At position "+i);
   }
}
public static void addSim(String newData){
    if(newData!=null){
	     sim[index++]=newData;
}
    else System.out.println("Cannot add , as it is already null");
}
public static void updateSimNames(String oldname, String newname ){
  for(int i =0; i<sim.length;i++){
    if(sim[i]==oldname){
      sim[i]=newname;
      System.out.println("Updated "+oldname+" to "+newname+" at index "+i);
    }
  }
}
public static void deleteSim(String deleteName){
  int i,j;
  boolean elementFound=false;
  for(i=0;i<sim.length;i++){
    if(sim[i]==deleteName){
      elementFound=true;
      break;
    }
  }
 if(elementFound==true){
  for(j=i;j<sim.length-1;j++){
        sim[j]=sim[j+1];
      }
      sim[j]=null;
     --index;
      System.out.println("The new number of elements is"+index);
    }
    else System.out.println("element not found");
}
}