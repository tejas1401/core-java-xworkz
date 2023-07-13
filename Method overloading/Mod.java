class Mod{
	public static void main(String[] args) {
		modulus(11,3);
		modulus(10,6);
		modulus(5,2);
		modulus(10,3);
		modulus(11,2,1);
		modulus(100,36,10);
		modulus(50,23,20);
		modulus(100,26,14);
	}
	public static void modulus(int a, int b){
		int result=a%b;
		System.out.println(result);
	} 
	public static void modulus(int a, int b, int c){
		int result=a%b%c;
		System.out.println(result);
	}
}