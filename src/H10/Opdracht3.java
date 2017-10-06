package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht3 extends Applet {
    TextField tekstvak;
    int maanden;
    String maand;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        maand = "";
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(maand, 50, 60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            maanden = Integer.parseInt(s);
            switch (maanden) {
                case 1:
                    maand = "Januari heeft 31 dagen.";
                    break;
                case 2:
                    maand = "Februari heeft 28 dagen.";
                    break;
                case 3:
                    maand = "Maart heeft 31 dagen.";
                    break;
                case 4:
                    maand = "April heeft 30 dagen.";
                    break;
                case 5:
                    maand = "Mei heeft 31 dagen.";
                    break;
                case 6:
                    maand = "Juni heeft 30 dagen.";
                    break;
                case 7:
                    maand = "Juli heeft 31 dagen.";
                    break;
                case 8:
                    maand = "Augustus heeft 31 dagen.";
                    break;
                case 9:
                    maand = "September heeft 30 dagen.";
                    break;
                case 10:
                    maand = "Oktober heeft 31 dagen.";
                    break;
                case 11:
                    maand = "November heeft 30 dagen.";
                    break;
                case 12:
                    maand = "December heeft 31 dagen.";
                    break;
                default:
                    maand = "Er zijn maar 12 maanden!";
                    break;
            }
            repaint();
        }
    }
}