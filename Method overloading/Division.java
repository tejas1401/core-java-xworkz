class Division{
	public static void main(String[] args) {
		div(5,2);
		div(10,3);
		div(11,3);
		div(10,6);
		div(50,23,21);
		div(11,2,1);
		div(153,36,11);
		div(246,26,11);
	}
	public static void div(int a, int b){
		int result=a/b;
		System.out.println(result);
	} 
	public static void div(double a, double b, double c){
		double result=(a/b)/c;
		System.out.println(result);
	}
}