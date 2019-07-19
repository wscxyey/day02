package cn.tedu.day02.demo;

public class SuperSunDemo {
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.a1);
		System.out.println(b.a2);
		A a=new B();
		System.out.println(a.a1);
		System.out.println(a.a2);
		B b2=(B)a;
		System.out.println(b2.a1);
		System.out.println(b2.a2);
	}
	
}

class A{
	int a1;
	int a2;
	int a3;
}

class B extends A{
	int a1;
	int a2;
	B(){
		super.a1=10;
		super.a2=20;
	}
}
