package assignment1;
import javax.swing.*;
public class Main
{
    private static void createAndShowGUI() {
        // ȷ��һ��Ư������۷��
        JFrame.setDefaultLookAndFeelDecorated(true);

        // ���������ô���
        JFrame frame = new JFrame("StudentsListEditor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ��� "Hello World" ��ǩ
//        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(new StudentsListEditor());

        // ��ʾ����
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
