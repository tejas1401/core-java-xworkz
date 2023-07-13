class Addition{
	public static void main(String[] args) {
		add(1,2);
		add(2,3);
		add(45,20);
		add(10,5);
		add(4,20);
		add(14,40,39);
		add(0,26,34);
		add(0,2,30);
		add(14,24,36);
		add(10,20,31);
	}
	public static void add(int a, int b){
		int result=a+b;
		System.out.println("The Sum of "+a+" and "+b+" is:"+result);
	}
	public static void add(int a,int b, int c){
		int result=a+b+c;
		System.out.println("The Sum of "+a+" and "+b+" and "+c+" is:"+result);
	}
}