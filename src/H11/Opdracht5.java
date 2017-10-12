package H11;

import java.awt.*;
import java.applet.Applet;

public class Opdracht5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int a = 0;
        int b = 0;

        for(teller = 0; teller < 5; teller++) {
            a += 25;
            b += 25;
            g.drawRect(a, b, 25, 25 );
        }
    }
}
