package H4;

import java.awt.*;
import java.applet.*;

public class H4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        setBackground(Color.white);
        g.setColor(Color.blue);
        g.drawLine(50,50,100,50);
        g.drawLine(100,50,75,15);
        g.drawLine(75,15,50,50);



    }
}