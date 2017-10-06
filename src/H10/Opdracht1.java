package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
    TextField tekstvak;
    int invoer;
    int hoogstgetal;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Het laatste getal is: " + hoogstgetal, 50, 60);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            invoer = Integer.parseInt(s);
            repaint();

            // Als het invoer groter is dan het hoogste getal dan word het hoogstegetal
            if (invoer > hoogstgetal) {
                hoogstgetal = invoer;
                tekstvak.setText(null);
            }
            repaint();
        }
    }
}
