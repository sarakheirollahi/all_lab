//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class Menu {
    JFrame frammenu = new JFrame();
    JMenu filemenu;
    JMenuBar menuBAr;

    public Menu() {
        this.frammenu.setTitle("Aut menu");
        this.frammenu.setSize(300, 300);
        this.frammenu.setLocation(100, 200);
        this.frammenu.setLayout(new BorderLayout());
        this.frammenu.setDefaultCloseOperation(3);
        this.frammenu.setVisible(true);
        this.menuBAr = new JMenuBar();
        this.filemenu = new JMenu("File");
        this.filemenu.setMnemonic('F');
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setAccelerator(KeyStroke.getKeyStroke(83, 2));
        exitItem.setMnemonic('x');
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        this.filemenu.add(exitItem);
        this.menuBAr.add(this.filemenu);
        this.frammenu.setJMenuBar(this.menuBAr);
    }
}
