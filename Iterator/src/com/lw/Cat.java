package com.lw;

public class Cat {
	public Cat(int id) {
		super();
		this.id = id;
	}

	private int id;
	
	@Override
	public String toString() {
		return "cat:" + id;
	}
}