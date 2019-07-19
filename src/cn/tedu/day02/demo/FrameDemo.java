package cn.tedu.day02.demo;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameDemo extends JPanel{
	public static void main(String[] args) {
		JFrame jFrame=new JFrame();
		FrameDemo frameDemo=new FrameDemo();
		jFrame.add(frameDemo);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(300, 600);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);
	}
}
