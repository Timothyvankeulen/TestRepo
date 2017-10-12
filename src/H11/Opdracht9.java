package H11;

import java.awt.*;
import java.applet.Applet;

public class Opdracht9 extends Applet {

    public void paint(Graphics g) {
        //Eerste rij
        setBackground(Color.blue);
        int y = 50;
        int x = 50;

        for (int lijn = 0; lijn < 8; lijn++) {

            if (lijn == 0 || lijn == 2 || lijn == 4 || lijn == 6) {
                for (int kolom = 0; kolom < 8; kolom++) {
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.black);
                        g.fillRect(x, y, 50, 50);
                    } else {
                        g.setColor(Color.white);
                        g.fillRect(x, y, 50, 50);
                    }
                    x += 50;
                }
            }
            else {
                for (int kolom = 0; kolom < 8; kolom++) {
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.white);
                        g.fillRect(x, y, 50, 50);
                    } else {
                        g.setColor(Color.black);
                        g.fillRect(x, y, 50, 50);
                    }
                    x += 50;
                }
            }
            x = 50;
            y += 50;
        }
    }
}
