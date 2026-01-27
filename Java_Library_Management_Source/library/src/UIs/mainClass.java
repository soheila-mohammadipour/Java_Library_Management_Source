/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIs;

public class mainClass {

    public static void main(String[] args) {
        Splash splash = new Splash();
        splash.setVisible(true);
        mainWindow main = new mainWindow();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
        }
        splash.setVisible(false);
        main.setVisible(true);
    }
}
