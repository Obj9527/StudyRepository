package ThreadPart;

import java.util.ArrayList;

public class MainThread {
	public MainThread() {
	}
	
	public static void main(String[] args) {
		ArrayList<StringBuilder> list = new ArrayList<StringBuilder>();
		StringBuilder in = new StringBuilder();
		in.append("hahaha");
		list.add(in);
		in.append("chchch");
		System.out.println(list.get(0).toString());
	}
}
