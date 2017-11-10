package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    double[] salaris;
    double gemiddelde;


    public void init() {
        salaris = new double[10];

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 100 * teller + 100;
        }
    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 20;

        for (int teller = 0; teller < salaris.length; teller ++) {
            y += 20;
            gemiddelde += salaris[teller];
            g.drawString("" + salaris[teller], x, y );
        }
        g.drawString("" + gemiddelde, x * 2, y);
    }
}