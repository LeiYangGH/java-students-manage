package assignment1;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class StudentsListEditor extends JPanel {
    private JButton btnLoad;
    private JButton btnSave;
    private JButton btnAdd;
    private JList jcomp4;
    private JLabel jcomp5;
    private JTextField jcomp6;
    private JLabel jcomp7;
    private JLabel jcomp8;
    private JLabel jcomp9;
    private JLabel jcomp10;
    private JTextField jcomp11;
    private JTextField jcomp12;
    private JTextField jcomp13;
    private JTextField jcomp14;
    private JButton btnClone;

    public StudentsListEditor() {
        //construct preComponents
        String[] jcomp4Items = {"Item 1", "Item 2", "Item 3"};

        //construct components
        btnLoad = new JButton ("Load");
        btnSave = new JButton ("Save");
        btnAdd = new JButton ("Add");
        jcomp4 = new JList (jcomp4Items);
        jcomp5 = new JLabel ("surname");
        jcomp6 = new JTextField (5);
        jcomp7 = new JLabel ("firstname");
        jcomp8 = new JLabel ("id");
        jcomp9 = new JLabel ("dob");
        jcomp10 = new JLabel ("newLabel");
        jcomp11 = new JTextField (5);
        jcomp12 = new JTextField (5);
        jcomp13 = new JTextField (5);
        jcomp14 = new JTextField (5);
        btnClone = new JButton ("Clone");

        //adjust size and set layout
        setPreferredSize (new Dimension (741, 493));
        setLayout (null);

        //add components
        add (btnLoad);
        add (btnSave);
        add (btnAdd);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);
        add (jcomp12);
        add (jcomp13);
        add (jcomp14);
        add (btnClone);

        //set component bounds (only needed by Absolute Positioning)
        btnLoad.setBounds (240, 25, 105, 35);
        btnSave.setBounds (365, 25, 105, 35);
        btnAdd.setBounds (485, 25, 105, 35);
        jcomp4.setBounds (10, 15, 195, 320);
        jcomp5.setBounds (240, 105, 100, 25);
        jcomp6.setBounds (380, 110, 140, 35);
        jcomp7.setBounds (240, 175, 100, 25);
        jcomp8.setBounds (245, 245, 100, 25);
        jcomp9.setBounds (240, 310, 100, 25);
        jcomp10.setBounds (-170, 440, 100, 25);
        jcomp11.setBounds (380, 175, 140, 30);
        jcomp12.setBounds (380, 245, 140, 35);
        jcomp13.setBounds (380, 310, 145, 30);
        jcomp14.setBounds (-220, 420, 150, 35);
        btnClone.setBounds (610, 25, 110, 35);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("StudentsListEditor");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new StudentsListEditor());
        frame.pack();
        frame.setVisible (true);
    }
}
