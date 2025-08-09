package Ass_2;

public class var_ex {
	int inst=10;
	static int sta=88;
public static void main(String[] args) {
	int loc=223;
	var_ex va=new var_ex();
	System.out.println("local variable is"+loc);
	System.out.println("instantan varble is"+va.inst);
	System.out.println("static variable is "+var_ex.sta);
}
}
