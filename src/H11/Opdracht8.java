package H11;

import java.awt.*;
import java.applet.Applet;

public class Opdracht8 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int x = 10;
        int y = 10;
        int grootte = 5;

        for(teller = 1; teller < 101; teller++) {
            x += 0;
            y += 0;
            grootte += 5;
            g.drawOval(x, y, grootte, grootte);
        }
    }
}
