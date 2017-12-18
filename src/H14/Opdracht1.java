package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
    Button Knop;
    String[] kaarten = { "Schoppen", "Klaver", "Harten", "Ruiten" };
    String[] soortKaarten = { "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "aas", "boer", "vrouw", "heer" };

    double r;
    int randomKaart;
    int randomSoort;

    public void init() {
        //Random Getal
        randomKaart = (int)(r * 4 + 0);
        randomSoort = (int)(r * 13 + 0);
        //Knopje
        Knop = new Button();
        Knop.setLabel("Shuffle");
        KnopListener kl = new KnopListener();
        Knop.addActionListener( kl );
        add(Knop);
    }

    public void paint(Graphics g) {
        g.drawString(kaarten[randomKaart] + " " + soortKaarten[randomSoort], 15,15);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            r = Math.random();
            randomKaart = (int)(r * 4 + 0);
            randomSoort = (int)(r * 13 + 0);
            repaint();
        }
    }
}