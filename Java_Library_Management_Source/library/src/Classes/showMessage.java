/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import javax.swing.JOptionPane;

/**
 *
 * @author mad
 */
public class showMessage {
    
    public static void error(String s){
        JOptionPane.showMessageDialog(null, s, "", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void information(String s){
        JOptionPane.showMessageDialog(null, s, "", JOptionPane.INFORMATION_MESSAGE);
    }
}
