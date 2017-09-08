package H4;

import java.applet.*;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRoundRect(25,25,75,180,45,45);
        g.setColor(Color.red);
        g.fillOval(50,50,25,25);
        g.setColor(Color.orange);
        g.fillOval(50,100,25,25);
        g.setColor(Color.green);
        g.fillOval(50,150,25,25);
    }

}
