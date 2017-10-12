package H11;

import java.awt.*;
import java.applet.Applet;

public class Opdracht4 extends Applet{

    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int keer = 3;
        int som;
        int a = 0;

        for(teller = 1; teller < 11; teller++) {
            a += 20;
            som = teller * keer;
            g.drawString("" + som, 20, a );
        }
    }
}

