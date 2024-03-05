
package com.harsha.strings;

public final class ImmutableDemo {
	private final int a;
	private final int b;
	public ImmutableDemo(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int get_A_Value() {
		return a;
		
	}
	public int get_B_Value() {
		return b;
		
	}
	public void sum() {
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		ImmutableDemo ib=new ImmutableDemo(50,78);
		ib.sum();
	}

}
