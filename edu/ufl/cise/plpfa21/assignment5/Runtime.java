package edu.ufl.cise.plpfa21.assignment5;

public class Runtime {

	public static boolean not(boolean arg) {
		return !arg;
	}
	
	public static int uminus(int arg) {
		return arg * -1;
	}
	
	public static boolean blt(boolean l, boolean r) {
		if(l == true && r == false) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean bgt(boolean l, boolean r) {
		if(l == false && r == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean beq(boolean l, boolean r) {
		if(l == false && r == false) {
			return true;
		}
		else if(l == true && r == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean bne(boolean l, boolean r) {
		if(l == false && r == true) {
			return true;
		}
		else if(l == true && r == false) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean ilt(int l, int r) {
		if(l > r) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean igt(int l, int r) {
		if(l < r) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean ieq(int l, int r) {
		if(l == r) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean ine(int l, int r) {
		if(l != r) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean slt(String l, String r) {
		if(l.startsWith(r)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean sgt(String l, String r) {
		if(r.startsWith(l)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean seq(String l, String r) {
		if(r.equals(l)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean sne(String l, String r) {
		if(!r.equals(l)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int iplus(int l, int r) {
		return r + l;
	}
	
	public static int iminus(int l, int r) {
		return r - l;
	}
	
	public static int idiv(int l, int r) {
		int temp = r / l;
		return temp;
	}
	
	public static int itimes(int l, int r) {
		return l * r;
	}
	
	public static String splus(String l, String r) {
		return r + l;
	}
	
	public static boolean and(boolean l, boolean r) {
		if(l && r) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean or(boolean l, boolean r) {
		if(l || r) {
			return true;
		}
		else {
			return false;
		}
	}
}
