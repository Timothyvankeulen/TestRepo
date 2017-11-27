package H13;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht2 extends Applet {


    public void paint(Graphics g) {
        int x = 25;
        int y = 50;
        tekenBoomGaard(g, x, y);
    }

    void tekenBoomGaard( Graphics g, int x, int y) {
        for (int teller = 0; teller < 2; teller++) {
            for (int i = 0; i < 5; i++) {
                g.setColor(new Color(139, 69, 19));
                g.fillRect(x, y, 20, 50);
                x += 50;
            }
            x = 25;
            y += 100;
        }
        x = 10;
        y = 20;
        for (int teller = 0; teller < 2; teller++) {
            for (int i = 0; i < 5; i++) {
                g.setColor(Color.green);
                g.fillOval(x, y, 50, 50);
                x += 50;
            }
            x = 10;
            y += 100;
        }
    }
}
