package day6;

public class p2 {
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		int num=1234; 
		String s=String.valueOf(num);
		System.out.println("String: "+s); 
		try { 
			
			int cint=Integer.parseInt(s); 
			System.out.println("Back to int: "+cint); 
			}
		catch(Exception e) { 
			System.out.println(e);
			} 
		} 
	}
	