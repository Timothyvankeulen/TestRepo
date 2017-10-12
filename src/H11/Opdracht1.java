package H11;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int a = 0;

        for(teller = 0; teller < 15; teller++) {
            a += 20;
            g.drawLine(a, 50, a, 300 );
            g.drawString("" + teller, a, 20 );
        }
    }
}