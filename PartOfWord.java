class PartOfWord{
private String str;
private int a;
private int b;

 PartOfWord (String str, int a, int b){
this.a = a;
this.b = b;
this.str = str;
	}

public String printPartOfWord(){


return str.substring(a,b);
}
}