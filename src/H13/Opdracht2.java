package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {
        int x = 10;
        int y = 10;
        tekenMuur(g, x, y);
    }

    void tekenMuur( Graphics g, int x, int y) {
        for (int teller = 0; teller < 5; teller++) {
            for (int i = 0; i < 10; i++) {
                g.setColor(Color.red);
                g.fillRect(x, y, 50, 25);
                x += 55;
            }

            x = 35;
            y += 30;

            for (int i = 0; i < 10; i++) {
                g.fillRect(x, y, 50, 25);
                x += 55;
            }
            y += 30;
            x = 10;
        }
    }
}