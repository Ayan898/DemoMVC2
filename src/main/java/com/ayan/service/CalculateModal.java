package com.ayan.service;

public class CalculateModal {
	private int i, j;
	private String op;
	public CalculateModal(int a, int b, String c) {
		// TODO Auto-generated constructor stub
		i = a;
		j = b;
		op = c;
	}
	public CalculateModal() {
		// TODO Auto-generated constructor stub
	}
	public int add(int i, int j) {
		return i+j;
	}
	public int sub(int i, int j) {
		return i-j;
	}
	public int mult(int i, int j) {
		return i*j;
	}
	public int div(int i, int j) {
		if(j == 0)return 0;
		return i/j;
	}
	public int mod(int i, int j) {
		if(j == 0)return 0;
		return i%j;
	}
	
	public int calculate() {
		int ans = 0;
		System.out.println(op);
		if(op.equals("addition")) {
			ans = add(i,j);
		}else if(op.equals("subtraction")) {
			ans = sub(i,j);
		}else if(op.equals("multiplication")) {
			ans = mult(i,j);
		}else if(op.equals("division")) {
			ans = div(i,j);
		}else if(op.equals("modulus")){
			ans = mod(i,j);
		}
		return ans;
	}
}