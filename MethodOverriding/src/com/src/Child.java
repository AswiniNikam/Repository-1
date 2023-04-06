package com.src;
class Parent{
	private void show() {
		System.out.println("Hii");
	}
}

public class Child extends Parent {
	private void show() {
		System.out.println("Hii");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child p=new Child();
		p.show();

	}

}
