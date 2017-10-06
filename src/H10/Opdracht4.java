package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht4 extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    int maanden;
    int jaartal;
    String maand;
    String tekst;

    public void init() {
        // Label
        label = new Label("Zet het jaartal in het eerste tekstvak en maand nummer in het tweede. ");
        add (label);
        // Eerste tekstvak (Jaartal)
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        maand = "";
        add(tekstvak);
        // Tweede tekstvak (Maanden en dagen)
        tekstvak2 = new TextField("", 20);
        tekstvak2.addActionListener(new TekstvakListener());
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString(maand, 50, 80);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String j = tekstvak.getText();
            jaartal = Integer.parseInt( j );
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst = ""+ jaartal + " is een schrikkeljaar";
            }
            else {
                tekst = ""+ jaartal + " is geen schrikkeljaar";
            }
            String m = tekstvak2.getText();
            maanden = Integer.parseInt(m);
            switch (maanden) {
                case 1:
                    maand = "Januari heeft 31 dagen.";
                    break;
                case 2:
                    if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0 ) {
                        maand = "Februari heeft 29 dagen.";
                    }else {
                        maand = "Februari heeft 28 dagen.";
                    }
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