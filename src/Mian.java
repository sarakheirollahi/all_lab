import javax.swing.*;

    public class Mian {

        public static void main(String[] arg){

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
            mycalculator.textAndScroll();
            mycalculator.button();
            mycalculator.pane();
            //Menu myMenu = new Menu();




        }



    }
