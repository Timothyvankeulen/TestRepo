package H4;

import java.applet.*;
import java.awt.*;

public class Opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRoundRect(25,25,100,100,30,30);
        g.setColor(Color.white);
        g.fillOval(45,45,21,21);
        g.fillOval(45,85,21,21);
        g.fillOval(85,45,21,21);
        g.fillOval(85,85,21,21);
    }
}
