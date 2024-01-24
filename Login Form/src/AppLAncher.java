 import javax.swing.SwingUtilities;

import backend.MyJDBC;
import gui.LoginFormGui;


public class AppLAncher {
    public static void main(String[] args) {
        // we use invokeLater() to make updates to GUI more thread safe and efficient
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // instance of LoginFormGUI 
               new LoginFormGui().setVisible(true);  
               // System.out.println(MyJDBC.checkUser("username125"));
            }
        });
    }
}