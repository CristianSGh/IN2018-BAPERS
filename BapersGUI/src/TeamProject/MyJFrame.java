/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeamProject;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author null
 */
public class MyJFrame extends JFrame {
    
    private static Image icon;
    
    static {
        try {
            String path = "Icon.png";
            icon = ImageIO.read(new File(path));
            
        } catch (IOException e) {
            System.out.println(e);
        }
        
    }

    public MyJFrame() throws HeadlessException {
        super();
        setIconImage(icon);
    }
    
}
