package cn.tedu.day02.demo;

public class NoNameClassDemo {
	void noNameMethor(InterA a) {
		a.say();
	}
	
	public static void main(String[] args) {
		NoNameClassDemo nameClassDemo=new NoNameClassDemo();
		nameClassDemo.noNameMethor(new InterA() {
			
			@Override
			public void say() {
				// TODO Auto-generated method stub
				System.out.println("English");
			}
		});
	}
	
}

interface InterA{
	void say();
}
