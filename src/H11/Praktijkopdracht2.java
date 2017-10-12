package H11;

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Praktijkopdracht2 extends Applet {
    Button ok;
    int getal;
    int teller;

    public void init() {
        //Oke knop
        ok = new Button ();
        ok.setLabel("Ok");
        ListenerOk lk = new ListenerOk();
        ok.addActionListener( lk );
        add(ok);
    }

    public void paint(Graphics g) {
        int y = 50;
        //For statement dat de teller 1 tot 10 weergeeft, die word weer keer het invoer getal gedaan.
        for (teller = 1; teller < 11; teller++) {
            y += 20;
            g.drawString(teller + "x" + getal + "=" + teller * getal, 70, y);
        }
    }

    class ListenerOk implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Optellen via de knop
            do {
                getal++;
            } while (getal > 11);
            //Als het getal gelijk is aan 11 dan word getal weer 1.
            if (getal == 11) {
                getal = 1;
            }
            repaint();
        }
    }
}
