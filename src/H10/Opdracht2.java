package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht2 extends Applet {
    TextField tekstvak;
    int invoergetal;
    int hoogstgetal;
    int laagstgetal;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Het Hoogste getal is: " + hoogstgetal, 50, 60);
        g.drawString("Het Laagst getal is: " + laagstgetal, 50, 80);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            invoergetal = Integer.parseInt(s);

            // Als het getal 0 is, word het laagstegetal het invoergetal
            if (laagstgetal == 0) {
                laagstgetal = invoergetal;
            }
            // Als het invoergetal groter is dan het hoogstegetal dan word het hoogstegetal het invoergetal
            if (invoergetal > hoogstgetal) {
                hoogstgetal = invoergetal;
                tekstvak.setText(null);
            }
            // Als het invoergetal kleiner is dan het laagstegetal dan word het laagstegetal het invoergetal
            if (invoergetal < laagstgetal) {
                laagstgetal = invoergetal;
                tekstvak.setText(null);
            }
            repaint();
        }
    }
}
