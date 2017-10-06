package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht5 extends Applet{
    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    Label label;
    Button ok;
    String antwoord;
    String tekst1;
    String tekst2;
    String tekst3;
    int getal1;
    int getal2;
    int getal3;
    double gemiddelde;
    double berekening;


    public void init() {
        //Tekst strings.
        antwoord = "";
        tekst1 = "";
        tekst2 = "";
        tekst3 = "";
        //Label
        label = new Label("Voer 3 cijfers in om het gemiddelde te berekenen. ");
        add (label);
        //Tekstvak 1
        tekstvak1 = new TextField("", 20);
        add(tekstvak1);
        //Tekstvak 2
        tekstvak2 = new TextField("", 20);
        add(tekstvak2);
        //Tekstvak 3
        tekstvak3 = new TextField("", 20);
        add(tekstvak3);
        //Ok knop
        ok = new Button ();
        ok.setLabel("Ok");
        ListenerOk lk = new ListenerOk();
        ok.addActionListener( lk );
        add(ok);

    }

    public void paint(Graphics g) {
        g.drawString("getal1: " + tekst1, 50, 100);
        g.drawString("getal2: " + tekst2, 50, 115);
        g.drawString("getal3: " + tekst3, 50, 130);
        g.drawString("Het is bij elkaar: " + berekening, 50, 150);
        g.drawString("Het gemiddelde is: " + gemiddelde, 50, 170);
        g.drawString("U bent: " + antwoord, 50, 190);
    }

    class ListenerOk implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            //Invoer tekstvak1
            String s1 = tekstvak1.getText();
            getal1 = Integer.parseInt( s1 );
            //Invoer tekstvak2
            String s2 = tekstvak2.getText();
            getal2 = Integer.parseInt( s2 );
            //Invoer tekstvak3
            String s3 = tekstvak3.getText();
            getal3 = Integer.parseInt( s3 );
            //Een switch statement om te laten zien of het getal voldoende of onvoldoende is.
            //Het getal van tekstvak 1
            switch(getal1) {
                case 1:
                case 2:
                case 3:
                case 4:
                    tekst1 = "Onvoldoende";
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    tekst1 = "Voldoende";
                    break;
                default:
                    tekst1 = "Te hoog.";
                    break;
            }
            repaint();
            switch(getal2) {
                case 1:
                case 2:
                case 3:
                case 4:
                    tekst2 = "Onvoldoende";
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    tekst2 = "Voldoende";
                    break;
                default:
                    tekst2 = "Te hoog. ";
                    break;
            }
            repaint();
            switch(getal3) {
                case 1:
                case 2:
                case 3:
                case 4:
                    tekst3 = "Onvoldoende";
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    tekst3 = "Voldoende";
                    break;
                default:
                    tekst3 = "Te hoog.  ";
                    break;
            }
            repaint();
            //De berekening
            berekening = getal1 + getal2 + getal3;
            gemiddelde = berekening / 3;
            //Het gemiddelde op 1 decimaal laten eindigen.
            gemiddelde = gemiddelde * 10;
            gemiddelde = (int) gemiddelde;
            gemiddelde = gemiddelde / 10;
            //If statement als het getal hoger is dan 5 is hij geslaagd anders gezakt.
            if (gemiddelde >= 5) {
                antwoord = "geslaagd";
            }
            else {
                antwoord = "gezakt";
            }
        }
    }
}

