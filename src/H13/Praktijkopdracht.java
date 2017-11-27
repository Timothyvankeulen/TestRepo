package H13;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    public void paint(Graphics g) {
        int x = 25;
        int y = 50;
        tekenBoom(g, x, y);
    }

    void tekenBoom( Graphics g, int x, int y) {
        g.setColor(new Color(139, 69, 19));
        g.fillRect(x, y, 20, 50);
        x = 10;
        y = 10;
        g.setColor(Color.green);
        g.fillOval(x, y, 50, 50);
    }
}