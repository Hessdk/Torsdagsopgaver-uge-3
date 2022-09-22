class Fibonacci{
int a;
int b;
int sum;
	Fibonacci(int a, int b){
this.a=a;
this.b=b;
this.sum = a+b;
	}

public static int fabanacci (){
	System.out.println(a + "\t");
	if (b > 1000){
		fabanacci (b, a+b);
	}
	}
}



/*

System.out.println(a);
	System.out.println(b);
	for (int i = 0; i <= 1000; i++){
 System.out.println(sum + "\t");

		sum = a + b;
		if (b > 1000) return 1000;
	
	a = b;
	b = sum;
}
return 1; 
*/