package cn.tedu.day02.demo;
//测试github 0709
public class CastDemo {
	public static void main(String[] args) {
		A1 a1=new A2();  //向上造型 不能访问子类中特有的成员
		A2 a2=(A2)a1;  //向下造型，可以访问子类中特有的成员
	}
}

class A1{
	
}

class A2 extends A1{
	
}

class A3 extends A1{
	
}
