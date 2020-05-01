import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Menu {

    JFrame frammenu;
    JMenu filemenu;
    JMenuBar menuBAr;
    public Menu(){
        frammenu = new JFrame();
        frammenu.setTitle("Aut menu");
        frammenu.setSize(300,300);
        frammenu.setLocation(100,200);
        frammenu.setLayout(new BorderLayout());
        frammenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frammenu.setVisible(true);
        menuBAr = new JMenuBar();
        filemenu = new JMenu("File");
        filemenu.setMnemonic('F');
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setAccelerator((KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK)));
        exitItem.setMnemonic('x');
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }});


        filemenu.add(exitItem);
        menuBAr.add(filemenu);
        frammenu.setJMenuBar(menuBAr);
    }
}
