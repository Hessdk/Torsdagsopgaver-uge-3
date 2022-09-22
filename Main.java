class Main{

	public static void main(String [] args){

fabanacci(1,1);
}

public static void fabanacci (int a, int b){
	System.out.println(a + "\t");
	if (b < 1000){
		fabanacci (b, a+b);
	}
}
}
	

