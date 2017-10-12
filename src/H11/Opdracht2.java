package H11;

import java.awt.*;
import java.applet.Applet;

public class Opdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int a = 0;

        for(teller = 20; teller > 9; teller--) {
            a += 20;
            g.drawString("" + teller, a, 20 );
        }
    }
}
