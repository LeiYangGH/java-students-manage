package assignment1;

import javax.swing.*;

public class Main {
    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("StudentsListEditor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new StudentsListEditor());

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Start of main!");
        createAndShowGUI();
        System.out.println("End of main!");
    }
}
