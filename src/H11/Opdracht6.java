package H11;

import java.awt.*;
import java.applet.Applet;

public class Opdracht6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int x = 100;
        int y = 100;
        int grootte = 5;

        for(teller = 0; teller < 5; teller++) {
            x -= 10;
            y -= 10;
            grootte += 20;
            g.drawOval(x, y, grootte, grootte);
        }
    }
}
