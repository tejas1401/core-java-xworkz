class OttMovies{
	static String kannadaMovies[]={"Uppi","Aishwarya","H2O","A","Super","Kalpana","Nanu","Upendra","Hollywood","Topiwala","Kanthara","Kotigobba3","Bahaddur","Pogaru","Kabzaa","Kranti","KGF 1","KGF 2","Head Bush","Robert","James","Vedha","Gandhadagudi","Galipata 2","Galipata 1"}; 
	static String tamilMovies[]={"Vikram","PS1","PS2","DejaVu","Cobra","Love Today","Varisu","Mersal","Youth","PS2","Theri","bigil","Leo","Sarkar","Gilli","Sardar","Master","Viduthulai","Kaithi","Bhairava","Porthizli","Beast","Vaathi","Sivakasi","Evaru"}; 
	static String hindiMovies[]={"3 Idiots","Dangal","Dhoom 1","Dhoom 2","Dhoom 3","Drishyam 1","Drishyam 2","Krish 1","Krish 2","Krish 3","Houseful 1","Houseful 2","Houseful 3","Sulthan","Dabangg 1","Dabangg 2","Pathaan","Ra one","Chennai express","Zero","Tube Light","Jai Ho","Kick","Kabir Singh","Ready"};
    static String englishMovies[]={"Winter Soldier","IronMan","Spiderverse","Casino Royale","Quantum Of Solace","Skyfall","Spectre","No Time to die","Godfather 1","Godfather 2","Godfather 3","Scarface","Spiderman","Inception","The Dark Knight","Pulp Fiction","Interstellar","Fight Club","Dune","65","Conjuring","The Avengers","Endgame","Seven","John Wick"};
    static String teluguMovies[]={"Custody","Dasara","Vatthi","Virupaksha","Sita RAman","RRR","Ravanasura","HIT 1","HIT 2","Rangasthalam","Pushpa","Evaru","Bimbisara","Dhamaka","Jersey","Love story","Krack","DJ Tillu","MAhanati","Arya","Sarrainodu","Bahubali","DJ","Happy","Eega"};
	public static void main(String[] args) {
int kanLen=kannadaMovies.length;
int tamLen=tamilMovies.length;
int hinLen=hindiMovies.length;
int enLen=englishMovies.length;
int telLen=teluguMovies.length;
//first method
System.out.println("Kannada Movies");
for (int i=0;i<kanLen;i++) {
	System.out.println(kannadaMovies[i]);
}
System.out.println("Tamil Movies");
for (int i=0;i<tamLen;i++) {
	System.out.println(tamilMovies[i]);
}
System.out.println("Hindi Movies");
for (int i=0;i<hinLen;i++ ) {
	System.out.println(hindiMovies[i]);
}
System.out.println("English Movies");
for (int i=0;i<enLen ;i++ ) {
System.out.println(englishMovies[i]);	
}
System.out.println("Telugu Movies");
for (int i=0;i<telLen ;i++ ) {
	System.out.println(teluguMovies[i]);
}
// second emthod of java arrays for each loop
System.out.println("The second method of arary access");
for (String km :kannadaMovies ) {
	System.out.println(km);
}
for (String tmm:tamilMovies ) {
	System.out.println(tmm);
}
for (String hm :hindiMovies ) {
	System.out.println(hm);
}
for (String em :englishMovies ) {
	System.out.println(em);
}
for (String tlm:teluguMovies ) { 	
 System.out.println(tlm);
	
}
	}
}