
import javax.swing.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class CalculatorGUI {
            JFrame calcFrame;
            JPanel panel1;
            JPanel panel2;
            JPanel panel3;
            JPanel panel4;


            public CalculatorGUI(){
                calcFrame = new JFrame();
                calcFrame.setTitle("Aut calculator");
                calcFrame.setSize(300,300);
                calcFrame.setLocation(100,200);
                calcFrame.setLayout(new BorderLayout());
                calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
            }

            public void button(){

                for(int i =9 ; i>6 ; i-- ) {
                    JButton btn = new JButton();
                    btn.setText(""+i);
                    btn.addActionListener
                    panel1.add(btn);
                }

                JButton btn1 = new JButton();
                btn1.setText("+");
               // btn1.addActionListener(new Actionbutton());

                panel1.add(btn1);

                for(int i =6 ; i>3 ; i-- ) {
                    JButton btn = new JButton();
                    btn.setText(""+i);
                    panel1.add(btn);
                }

                JButton btn2 = new JButton();
                btn2.setText("-");
                panel1.add(btn2);
                btn2.setToolTipText("this is mines");


                for(int i =3 ; i>0 ; i-- ) {
                    JButton btn = new JButton();
                    btn.setText(""+i);
                    panel1.add(btn);
                }

                JButton btn7 = new JButton();
                btn7.setText("0");
                panel1.add(btn7);

                JButton btn3 = new JButton();
                btn3.setText("÷");
                panel1.add(btn3);

                JButton btn4 = new JButton();
                btn4.setText("x");
                panel1.add(btn4);


                JButton btn5 = new JButton();
                btn5.setText(".");
                panel1.add(btn5);

                JButton btn6 = new JButton();
                btn6.setText("=");
                panel1.add(btn6);

                JButton btn8 = new JButton();
                btn8.setText("AC");
                panel2.add(btn8,BorderLayout.WEST);

                for(int i =9 ; i>6 ; i-- ) {
                    JButton btn = new JButton();
                    btn.setText(""+i);
                    panel3.add(btn);
                }

                JButton btn11 = new JButton();
                btn11.setText("+");
                panel3.add(btn11);

                for(int i =6 ; i>3 ; i-- ) {
                    JButton btn = new JButton();
                    btn.setText(""+i);
                    panel3.add(btn);
                }

                JButton btn22 = new JButton();
                btn22.setText("-");
                panel3.add(btn22);


                for(int i =3 ; i>0 ; i-- ) {
                    JButton btn = new JButton();
                    btn.setText(""+i);
                    panel3.add(btn);
                }

                JButton btn77 = new JButton();
                btn77.setText("0");
                panel3.add(btn77);

                JButton btn33 = new JButton();
                btn33.setText("÷");
                panel3.add(btn33);

                JButton btn44 = new JButton();
                btn44.setText("x");
                panel3.add(btn44);


                JButton btn55 = new JButton();
                btn55.setText(".");
                panel3.add(btn55);

                JButton btn66 = new JButton();
                btn66.setText("=");
                panel3.add(btn66);

                JButton btn88 = new JButton();
                btn88.setText("AC");
                panel4.add(btn88,BorderLayout.EAST);

                JButton btn9 = new JButton();
                btn9.setText("sin");
                panel3.add(btn9);

                JButton btn10 = new JButton();
                btn10.setText("cos");
                panel3.add(btn10);

                JButton btn12 = new JButton();
                btn12.setText("log");
                panel3.add(btn12);

                JButton btn13 = new JButton();
                btn13.setText("exp");
                panel3.add(btn13);

                JButton btn14 = new JButton();
                btn14.setText("tan");
                panel3.add(btn14);

                JButton btn15 = new JButton();
                btn15.setText("cot");
                panel3.add(btn15);

                JButton btn16 = new JButton();
                btn16.setText("shsin/cos");
                panel3.add(btn16);

                JButton btn17 = new JButton();
                btn17.setText("shtan/cot");
                panel3.add(btn17);

                JButton btn18 = new JButton();
                btn18.setText("shPI/E");
                panel3.add(btn18);
            }

            public void textAndScroll(){
                JTextArea display = new JTextArea(10,100);
                //display.setEditable(true);
                display.setFont(new Font("Arial",14,14));
                JScrollPane scrollPane = new JScrollPane(display);
                scrollPane.setPreferredSize(new Dimension(100,50));
                scrollPane.setLocation(50,10);
                JTextArea display1 = new JTextArea(10,100);
                //display1.setEditable(true);
                display1.setFont(new Font("Arial",14,14));
                JScrollPane scrollPane1 = new JScrollPane(display1);
                scrollPane1.setPreferredSize(new Dimension(100,50));
                scrollPane1.setLocation(50,10);
                panel2.add(scrollPane,BorderLayout.NORTH);
                panel2.add(panel1,BorderLayout.CENTER);
                panel4.add(scrollPane1,BorderLayout.NORTH);
                panel4.add(panel3,BorderLayout.CENTER);

            }

            public void pane(){
                JTabbedPane tp = new JTabbedPane();
                tp.setBounds(150,150,200,200);
                tp.add( "sade",panel2);
                tp.add("mohandesi",panel4);
                calcFrame.add(tp);



            }
            public class Mylistener implements KeyListener {

                @Override
                public void keyTyped(KeyEvent keyEvent) {


                }

                @Override
                public void keyPressed(KeyEvent keyEvent) {
                    Scanner b = new Scanner(System.in);
                    String str = b.next();
                    boolean add;
                    switch (str){
                            case "+":{
                            add = true
                                    break;}
                            case "-":{
                            minz = true
                                    break;}
                            case "/":
                            div = true;
                                    break;
                            case "*":
                            mull = true
                                    break;
                    }




                }

                @Override
                public void keyReleased(KeyEvent keyEvent) {

                }
            }










        }
