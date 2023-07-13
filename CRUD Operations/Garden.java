import java.util.Arrays;

class Garden{
static String flowerNames[]={null,null,null,null};
static int index;
public static void getFlowerNames(){
  String reference="";
   for(int i=0;i<index;i++){
     reference= flowerNames[i];
    System.out.println(reference+" At position "+i);
   }
}
public static void addFlowerNames(String newData){
    if(newData!=null&&index<flowerNames.length){
	     flowerNames[index++]=newData;
}
    else System.out.println("Cannot add , as it is already null");
}
public static void updateFlowerNames(String oldname, String newname ){
  for(int i =0; i<flowerNames.length;i++){
    if(flowerNames[i]==oldname){
      flowerNames[i]=newname;
      System.out.println("Updated "+oldname+" to "+newname+" at index "+i);
    }
  }
}
public static void deleteFlower(String deleteName){
  int i,j;
  boolean elementFound=false;
  for(i=0;i<index;i++){
    if(flowerNames[i]==deleteName){
      elementFound=true;
      break;
    }
  }
 if(elementFound==true){
  for(j=i;j<index-1;j++){
        flowerNames[j]=flowerNames[j+1];
      }
      flowerNames[j]=null;
     --index;
      System.out.println("The new number of elements is"+index);
    }
    else System.out.println("element not found");
}
public static String searchInArray(String inputele){
String temp=null;
for (String ele :flowerNames ) {
  if(ele==inputele){
    temp=inputele;
    System.out.println(inputele+" is found");
    return inputele;
  }
}
if(temp==null) System.out.println(inputele+" not found");
return temp;
}
}