package assignment1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentsListEditor extends JPanel {

    private List<Student> lstStudents = new ArrayList<Student>();
    StudentStorage storage = new StudentStorage();
    private JButton btnLoad;
    private JButton btnSave;
    private JButton btnAdd;
    private JList lstStuCtl;
    private JLabel jcomp5;
    private JTextField txtSurname;
    private JLabel jcomp7;
    private JLabel jcomp8;
    private JLabel jcomp9;
    private JLabel jcomp10;
    private JTextField txtFirstname;
    private JTextField txtId;
    private JTextField txtDob;
    private JTextField jcomp14;
    private JButton btnClone;

    public StudentsListEditor() {
        //construct preComponents
        String[] jcomp4Items = {"Item 1", "Item 2", "Item 3"};
        String studentsFile = "studentsFile.dat";

        //construct components
        btnLoad = new JButton("Load");
        btnSave = new JButton("Save");
        btnAdd = new JButton("Add");
        lstStuCtl = new JList(jcomp4Items);
        jcomp5 = new JLabel("surname");
        txtSurname = new JTextField(5);
        jcomp7 = new JLabel("firstname");
        jcomp8 = new JLabel("id");
        jcomp9 = new JLabel("dob");
        jcomp10 = new JLabel("newLabel");
        txtFirstname = new JTextField(5);
        txtId = new JTextField(5);
        txtDob = new JTextField(5);
        jcomp14 = new JTextField(5);
        btnClone = new JButton("Clone");

        //adjust size and set layout
        setPreferredSize(new Dimension(741, 493));
        setLayout(null);

        //add components

//        btnLoad.addActionListener(
//                new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        txtSurname.setText("txtSurname");
//                        txtFirstname.setText("txtFirstname");
//                        txtId.setText("id");
//                        txtDob.setText("dob");
//                    }
//                }
//        );

        add(btnLoad);

        btnSave.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            storage.save(lstStudents, studentsFile);
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                        }
                    }
                }
        );

        add(btnSave);
        add(btnAdd);
        add(lstStuCtl);
        add(jcomp5);
        add(txtSurname);
        add(jcomp7);
        add(jcomp8);
        add(jcomp9);
        add(jcomp10);
        add(txtFirstname);
        add(txtId);
        add(txtDob);
        add(jcomp14);
        add(btnClone);

        //set component bounds (only needed by Absolute Positioning)
        btnLoad.setBounds(240, 25, 105, 35);
        btnSave.setBounds(365, 25, 105, 35);
        btnAdd.setBounds(485, 25, 105, 35);
        lstStuCtl.setBounds(10, 15, 195, 320);
        jcomp5.setBounds(240, 105, 100, 25);
        txtSurname.setBounds(380, 110, 140, 35);
        jcomp7.setBounds(240, 175, 100, 25);
        jcomp8.setBounds(245, 245, 100, 25);
        jcomp9.setBounds(240, 310, 100, 25);
        jcomp10.setBounds(-170, 440, 100, 25);
        txtFirstname.setBounds(380, 175, 140, 30);
        txtId.setBounds(380, 245, 140, 35);
        txtDob.setBounds(380, 310, 145, 30);
        jcomp14.setBounds(-220, 420, 150, 35);
        btnClone.setBounds(610, 25, 110, 35);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentsListEditor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new StudentsListEditor());
        frame.pack();
        frame.setVisible(true);
    }
}
