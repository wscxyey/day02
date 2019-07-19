package cn.tedu.day02.demo;

public class InnerClassDemo {
	static int L;
	private int k;
	
	private void test() {
		System.out.println("test");
	}
	
	class InnerClass{
		private int a;
		int b;
		int c;
		private void say() {
			System.out.println("hello world");
			System.out.println(a);
			System.out.println(k);  //访问外部类私有成员变量
			System.out.println(L);
			test();  //访问外部类的私有方法
		}
		
	}
	
	void output() {
		InnerClass innerClass=new InnerClass();  //创建内部类对象
		innerClass.say(); //调用内部类的方法
	}
	public static void main(String[] args) {
		InnerClassDemo innerClassDemo=new InnerClassDemo();
		innerClassDemo.output();
	}

}
