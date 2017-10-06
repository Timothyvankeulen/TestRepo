package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {
    TextField tekstvak;
    int getal;
    String tekst;


    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
        tekst = "";
    }

    public void paint(Graphics g) {
        g.drawString("Uw cijfer is: " + tekst, 50,60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = tekstvak.getText();
            getal = Integer.parseInt( s1 );
            switch(getal) {
                case 1:
                case 2:
                case 3:
                    tekst = "slecht";
                    break;
                case 4:
                    tekst = "onvoldoende";
                    break;
                case 5:
                    tekst = "matig";
                    break;
                case 6:
                case 7:
                    tekst = "voldoende";
                    break;
                case 8:
                case 9:
                case 10:
                    tekst = "goed";
                    break;
                default:
                    tekst = "Te hoog.";
                    break;
            }
            repaint();
        }
    }
}

