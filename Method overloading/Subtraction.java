class Subtraction{
	public static void main(String[] args) {
		sub(10,3);
		sub(5,2);
		sub(11,3);
		sub(10,6);
		sub(11,2,1);
		sub(50,23,20);
		sub(100,26,14);
		sub(100,36,10);
	}
	public static void sub(int a, int b){
		int  result=a-b;
		System.out.println(result);
	}
	public static void sub(int a, int b, int c){

		int result=a-b-c;
		System.out.println(result);
	}
}