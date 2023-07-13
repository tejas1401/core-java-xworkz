class Multiply{
	public static void main(String[] args) {
		mul(10,3);
		mul(5,2);
		mul(11,3);
		mul(10,6);
		mul(11,2,1);
		mul(50,23,20);
		mul(100,26,14);
		mul(100,36,10);
	}
	public static void mul(int a, int b){
		int result=a*b;
		System.out.println(result);
	} 
	public static void mul(int a, int b, int c){
		int result=a*b*c;
		System.out.println(result);
	}
}