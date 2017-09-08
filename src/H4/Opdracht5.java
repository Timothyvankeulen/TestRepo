package H4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(20,20,100,50,90,360);
    }

}
