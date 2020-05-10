import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class
Mian {

        public static void main(String[] arg) throws IOException {

            try
            {
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Windows".equals(info.getName()))
                    {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (Exception e) {     /* If Nimbus is not available, you can set the GUI to another look and feel. }*/ }

            CalculatorGUI mycalculator = new CalculatorGUI();
            mycalculator.pannel();
            mycalculator.button();
            mycalculator.pane();
            mycalculator.initMenuBar();


            //Menu myMenu = new Menu();

        }
      }
