package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {
    Button knopRood;
    Button knopGrijs;

    boolean gekliktRood = false;
    boolean gekliktGrijs = false;

    public void init() {
        knopRood = new Button();
        knopRood.setLabel("Rood");
        KnopListenerRood klr = new KnopListenerRood();
        knopRood.addActionListener( klr );
        add(knopRood);

        knopGrijs = new Button();
        knopGrijs.setLabel("Grijs");
        KnopListenerGrijs klg = new KnopListenerGrijs();
        knopGrijs.addActionListener( klg );
        add(knopGrijs);
    }

    public void paint(Graphics g) {
        int x = 10;
        int y = 10;
        tekenMuur(g, x, y);
    }

    void tekenMuur( Graphics g, int x, int y) {
        if (gekliktRood == true) {
            for (int teller = 0; teller < 5; teller++) {
                for (int i = 0; i < 11; i++) {
                    g.setColor(Color.red);
                    g.fillRect(x, y, 50, 25);
                    x += 55;
                }

                x = 35;
                y += 30;

                for (int i = 0; i < 11; i++) {
                    g.fillRect(x, y, 50, 25);
                    x += 55;
                }
                y += 30;
                x = 10;
            }
        }

        if (gekliktGrijs == true) {
            for (int teller = 0; teller < 5; teller++) {
                for (int i = 0; i < 11; i++) {
                    g.setColor(Color.gray);
                    g.fillRect(x, y, 75, 40);
                    x += 90;
                }

                x = 50;
                y += 50;

                for (int i = 0; i < 11; i++) {
                    g.fillRect(x, y, 75, 40);
                    x += 90;
                }
                y += 50;
                x = 10;
            }
        }
    }

    class KnopListenerRood implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gekliktRood = true;
            gekliktGrijs = false;
            repaint();
        }
    }

    class KnopListenerGrijs implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gekliktGrijs = true;
            gekliktRood = false;
            repaint();
        }
    }
}