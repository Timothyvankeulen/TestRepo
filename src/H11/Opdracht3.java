package H11;

import java.awt.*;
import java.applet.Applet;

public class Opdracht3 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int getal1 = 0;
        int getal2 = 1;
        int x = 0;
        int som;


        for(teller = 0; teller < 15; teller++) {
            x += 30;
            g.drawString("" + (getal1+getal2), x, 20 );
            som = getal1;
            getal1 = getal2;
            getal2 = som + getal2;
        }
    }
}
