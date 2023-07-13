class Cricket{
	static String batsmen[]={"Virat Kohli","ROhit SHarma","Steve Smith","David warner","Shubman Gill","Glen Maxwell","Faf Du Plesis","KL Rahul","Surya Kumar Yadav","Chris Gayle"};
	static String iplTeams[]={"Royal Challengers Bangalore","Chennai Super Kings","Mumbai Indians","Sun Risers hyderabad","Delhi Capitals","Lucknow Super Giants","Kolkata Knight Riders","PUnjab Kings","Gujrat Titans","Rajasthan Royals"};
	static String topICCTeams[]={"India","Australia","England","New Zealand","Pakisthan","South Africa","West Indies","Sri Lanka","Bangladesh","Afghanistan"};
	public static void main(String bro[])
	{
		int blen=batsmen.length();
		int ilen=iplTeams.length();
		int toplen=topICCTeams.length();
System.out.println("Batsmen");
for (int i=0;i< blen;i++) {
	System.out.println(batsmen[i]);
}
System.out.println("IPL Teams");
for(i=0;i<ilen;i++){
	System.out.println(iplTeams[i]);
}
System.out.println("Top ICC Teams");
for (i=0;i<toplen ;i++ ) {
	System.out.println(topICCTeams[i]);
}
}
}