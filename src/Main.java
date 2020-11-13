//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.IOException;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Main {
    public Main() {
    }

    public static void main(String[] arg) throws IOException {
        try {
            LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                LookAndFeelInfo info = var1[var3];
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception var5) {
        }

        CalculatorGUI mycalculator = new CalculatorGUI();
        mycalculator.pannel();
        mycalculator.button();
        mycalculator.pane();
        mycalculator.initMenuBar();
    }
}
