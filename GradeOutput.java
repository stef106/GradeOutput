import javax.swing.*;

/**
 * Created by spl254 on 3/15/2017.
 */
public class GradeOutput {
    public static void main(String[] args) {
        double sgrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Input student percentage"));
        if (sgrade >= 90) {
            JOptionPane.showMessageDialog(null, "Grade is 'A'");
        } else {
            if (sgrade >= 80) {
                JOptionPane.showMessageDialog(null, "Grade is 'B'");
            } else {
                if (sgrade >= 70) {
                    JOptionPane.showMessageDialog(null, "Grade is 'C'");
                } else {
                    if (sgrade >= 60) {
                        JOptionPane.showMessageDialog(null, "Grade is 'D'");
                    } else {
                        JOptionPane.showMessageDialog(null, "Grade is 'F'");
                    }
                }
            }


        }
    }
}