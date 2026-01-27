/*
 * class tools 2 ta tabe mohem ke estefade mishe dare
 * 
 * Programer: AbdolsalamDehvari mad
 */
package Tools;

import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Tools {

    // in tabe baraye gharar dadane frame dar vasate monitor e.
    public static void setLocation(JFrame jframe) {
        double w = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        double h = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        w = (w - jframe.getWidth()) / 2;
        h = (h - jframe.getHeight()) / 2;
        jframe.setLocation((int) w, (int) h);
    }
    public static void setLocation(JDialog jframe) {
        double w = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        double h = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        w = (w - jframe.getWidth()) / 2;
        h = (h - jframe.getHeight()) / 2;
        jframe.setLocation((int) w, (int) h);
    }

    // in tabe baraye windows y kardane frame ha estefade mishe.
    public static void setWindowsStyle(JFrame jf) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(jf);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, e, "WindowsStyle", 0);
        }
    }

    public static void setWindowsStyleAndLoaction(JFrame jfram) {
        setLocation(jfram);
        setWindowsStyle(jfram);
    }
}
