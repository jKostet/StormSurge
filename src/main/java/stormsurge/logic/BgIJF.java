package stormsurge.logic;

import javax.swing.*;
import java.awt.*;

class BgIJF extends JFrame {
    JButton b1;
    JLabel l1;
    
//    private GUI_MainMenu mm;
    
    public BgIJF() {
//        this.mm = new GUI_MainMenu();
        
	setTitle("Background");
	setSize(800, 600);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	setVisible(true);

	setLayout(new BorderLayout());
	JLabel background=new JLabel(new ImageIcon("/home/jkostet/KOODIS/javalabra/Assets/us_warships_1945.jpg"));
	add(background);
//        add(mm);
//        mm.setVisible(true);
    }
}