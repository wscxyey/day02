package cn.tedu.day02.demo;

public class InnerClassDemo2 {
	void getImfor(InterMethor interMethor,int age,char sex) {
		interMethor.work();
		interMethor.languages();
		String string=interMethor.imformations(age,sex);
		System.out.println(string);
	}
	public static void main(String[] args) {
		/*Person1 person1=new Person1();
		person1.work();
		person1.languages();
		String imforString=person1.imformations(20, '男');
		System.out.println(imforString);*/
		
		InnerClassDemo2 innerClassDemo2=new InnerClassDemo2();
		innerClassDemo2.getImfor(new InterMethor() {   //匿名内部类的应用
			
			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("我的工作是医生");
			}
			
			@Override
			public void languages() {
				// TODO Auto-generated method stub
				System.out.println("我说英语");
			}
			
			@Override
			public String imformations(int age, char sex) {
				// TODO Auto-generated method stub
				return "我的年龄是："+age+"  "+"我的性别是："+sex;
			}
		}, 20, '男');
	}
}

interface InterMethor{
	void work();
	void languages();
	String imformations(int age,char sex);
}

/*class Person1 implements InterMethor{
	public void work() {
		System.out.println("我的工作是医生");
	}
	public void languages() {
		System.out.println("我说的是中文");
	}
	public String imformations(int age,char sex ) {
		return "我的年龄是："+age+",性别是："+sex;
	}
}*/
