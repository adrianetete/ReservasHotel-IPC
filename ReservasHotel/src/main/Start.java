package main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author adri
 */
public class Start {
    
    public static Home homeState;
    public static IniciarSesion iniciarSesionState;
    
    public static void main(String[] args) {
        
         try {
            // Set System L&F
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException e) {
           // handle exception
        }
        catch (ClassNotFoundException e) {
           // handle exception
        }
        catch (InstantiationException e) {
           // handle exception
        }
        catch (IllegalAccessException e) {
           // handle exception
        }
         
         iniciarSesionState = new IniciarSesion();
    }
}
