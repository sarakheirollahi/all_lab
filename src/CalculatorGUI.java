
import javax.swing.*;
import static java.lang.Math.pow;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JFrame;
import javax.swing.KeyStroke;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.Scanner;

public class CalculatorGUI extends JFrame {
    JFrame calcFrame;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    double num1=0;
    double num2=0;
    boolean op=false;
    boolean dop;
    boolean dot;
    int i=0;
    char op1;


    JMenuBar menuBar = new JMenuBar();
    JMenu jmenu = new JMenu("File");
    private JMenuItem copyItem;
    private JMenuItem saveItem;
    private JMenuItem exitItem;


    // File newTextFile = new File("C:/thetextfile.txt");

    //FileWriter fw = new FileWriter(newTextFile);



    JTextArea display  = new JTextArea(10, 100);
    JTextArea display1 = new JTextArea(10, 100);

    JButton btn1 = new JButton();
    JButton btn2 = new JButton();
    JButton btn3 = new JButton();
    JButton btn4 = new JButton();
    JButton btn5 = new JButton();
    JButton btn6 = new JButton();
    JButton btn7 = new JButton();
    JButton btn8 = new JButton();
    JButton btn9 = new JButton();
    JButton btn10 = new JButton();
    JButton btn11 = new JButton();
    JButton btn12 = new JButton();
    JButton btn13 = new JButton();
    JButton btn14 = new JButton();
    JButton btn15 = new JButton();
    JButton btn16 = new JButton();
    JButton btn17 = new JButton();
    JButton btn18 = new JButton();
    JButton btn19 = new JButton();
    JButton btn20 = new JButton();
    JButton btn21 = new JButton();
    JButton btn22 = new JButton();
    JButton btn23 = new JButton();
    JButton btn24 = new JButton();
    JButton btn25 = new JButton();
    JButton btn26 = new JButton();
    JButton btn27 = new JButton();
    JButton btn28 = new JButton();
    JButton btn29 = new JButton();
    JButton btn30 = new JButton();
    JButton btn31 = new JButton();
    JButton btn32 = new JButton();
    JButton btn33 = new JButton();
    JButton btn34 = new JButton();
    JButton btn35 = new JButton();
    JButton btn36 = new JButton();
    JButton btn37 = new JButton();
    JButton btn38 = new JButton();
    JButton btn39 = new JButton();
    JButton btn40 = new JButton();
    JButton btn41 = new JButton();
    JButton btn42 = new JButton();
    JButton btn43 = new JButton();


    public void initMenuBar() {

        copyItem = new JMenuItem("copy");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        jmenu.add(copyItem);
        jmenu.add(saveItem);
        jmenu.add(exitItem);
        menuBar.add(jmenu);
        //setJMenuBar(menuBar);
        jmenu.setMnemonic('F');
    }




    public CalculatorGUI() throws IOException {
        calcFrame = new JFrame();
        calcFrame.setTitle("Aut calculator");
        calcFrame.setSize(300,300);
        calcFrame.setLocation(100,200);
        calcFrame.setLayout(new BorderLayout());
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcFrame.setJMenuBar(menuBar);
        calcFrame.setVisible(true);

    }
    public void pannel(){

        panel1 = new JPanel();
        panel1.setSize(300,300);
        panel1.setLayout(new GridLayout(4,4));
        panel2 = new JPanel();
        panel2.setSize(50,200);
        panel2.setLayout(new BorderLayout());
        panel3 = new JPanel();
        panel3.setSize(300,300);
        panel3.setLayout(new GridLayout(5,5));
        panel4 = new JPanel();
        panel4.setSize(50,200);
        panel4.setLayout(new BorderLayout());
        calcFrame.add(panel1,BorderLayout.CENTER);
        calcFrame.add(panel2,BorderLayout.NORTH);
        calcFrame.add(panel3,BorderLayout.CENTER);
        calcFrame.add(panel4,BorderLayout.NORTH);
        panel1.setFocusable(true);
        panel1.requestFocusInWindow();
        panel2.setFocusable(true);
        panel2.requestFocusInWindow();
        panel3.setFocusable(false);
        panel3.requestFocusInWindow();
        panel4.setFocusable(false);
        panel4.requestFocusInWindow();
        display.setFocusable(false);
        display.requestFocusInWindow();
        display1.setFocusable(false);
        display1.requestFocusInWindow();
    }



    public void button(){


        //display.setEditable(true);
        display.setFont(new Font("Arial",14,14));
        JScrollPane scrollPane = new JScrollPane(display);
        scrollPane.setPreferredSize(new Dimension(100,50));
        scrollPane.setLocation(50,10);

        //display1.setEditable(true);
        display1.setFont(new Font("Arial",14,14));
        JScrollPane scrollPane1 = new JScrollPane(display1);
        scrollPane1.setPreferredSize(new Dimension(100,50));
        scrollPane1.setLocation(50,10);
        panel2.add(scrollPane,BorderLayout.NORTH);
        panel2.add(panel1,BorderLayout.CENTER);
        panel4.add(scrollPane1,BorderLayout.NORTH);
        panel4.add(panel3,BorderLayout.CENTER);

        btn1.setText("9");
        panel1.add(btn1);


        btn2.setText("8");
        panel1.add(btn2);

        btn3.setText("7");
        panel1.add(btn3);


        btn4.setText("+");
        panel1.add(btn4);


        btn4.setToolTipText("this is plus");



        btn5.setText("6");
        panel1.add(btn5);

        btn7.setText("4");
        panel1.add(btn7);


        btn8.setText("-");
        panel1.add(btn8);
        btn8.setToolTipText("this is mines");

        btn9.setText("3");
        panel1.add(btn9);

        btn10.setText("2");
        panel1.add(btn10);


        btn11.setText("1");
        panel1.add(btn11);

        btn12.setText("÷");
        panel1.add(btn12);


        btn12.setToolTipText("this is divide");

        btn13.setText("0");
        panel1.add(btn13);


        btn14.setText(".");
        panel1.add(btn14);

        btn15.setText("=");
        panel1.add(btn15);



        btn16.setText("x");
        panel1.add(btn16);


        btn17.setText("AC");
        panel2.add(btn17,BorderLayout.WEST);

        btn17.setToolTipText("For Delete");


        btn18.setText("9");
        panel3.add(btn18);

        btn19.setText("8");
        panel3.add(btn19);

        btn20.setText("7");
        panel3.add(btn20);

        btn21.setText("+");
        panel3.add(btn21);

        btn22.setText("-");
        panel3.add(btn22);


        btn23.setText("6");
        panel3.add(btn23);

        btn24.setText("5");
        panel3.add(btn24);

        btn25.setText("4");
        panel3.add(btn25);


        btn26.setText("÷");
        panel3.add(btn26);
        btn26.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display1.append("÷");
            }  });
        btn27.setText("x");
        panel3.add(btn27);

        btn28.setText("3");
        panel3.add(btn28);

        btn29.setText("2");
        panel3.add(btn29);

        btn30.setText("1");
        panel3.add(btn30);


        btn31.setText("=");
        panel3.add(btn31);

        btn32.setText(".");
        panel3.add(btn32);

        btn33.setText("0");
        panel3.add(btn33);



        btn34.setText("AC");
        panel4.add(btn34,BorderLayout.EAST);
        btn34.setToolTipText("For Delete");


        btn35.setText("sin");
        panel3.add(btn35);

        btn36.setText("cos");
        panel3.add(btn36);
        btn36.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display1.append("cos");
            }  });

        btn37.setText("log");
        panel3.add(btn37);

        btn38.setText("exp");
        panel3.add(btn38);


        btn39.setText("tan");
        panel3.add(btn39);


        btn40.setText("cot");
        panel3.add(btn40);

        btn41.setText("shsin/cos");
        panel3.add(btn41);

        btn42.setText("shtan/cot");
        panel3.add(btn42);


        btn43.setText("shPI/E");
        panel3.add(btn43);

    }



    public void pane(){
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(150,150,200,200);
        tp.add( "sade",panel2);
        tp.add("mohandesi",panel4);
        calcFrame.add(tp);
    }


}

