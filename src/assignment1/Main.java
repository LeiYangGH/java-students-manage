package assignment1;
import javax.swing.*;
public class Main
{
    private static void createAndShowGUI() {
        // 确保一个漂亮的外观风格
        JFrame.setDefaultLookAndFeelDecorated(true);

        // 创建及设置窗口
        JFrame frame = new JFrame("StudentsListEditor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 添加 "Hello World" 标签
//        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(new StudentsListEditor());

        // 显示窗口
        frame.pack();
        frame.setVisible(true);
    }
	public static void main(String[] args)
	{
        System.out.println("Start of main!");
        createAndShowGUI();
		System.out.println("End of main!");
	}
}
