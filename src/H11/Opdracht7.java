package H11;

import java.awt.*;
import java.applet.Applet;

public class Opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int x = 255;
        int y = 255;
        int grootte = 5;

        for(teller = 0; teller < 50; teller++) {
            x -= 5;
            y -= 5;
            grootte += 10;
            g.drawOval(x, y, grootte, grootte);
        }
    }
}
