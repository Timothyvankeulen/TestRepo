package Challenges;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WereldTijd extends Applet{
    private int tijd;
    private int tijdlondon;
    private int tijdtokyo;
    private int tijdsydney;
    private int tijdnewyork;
    private TextField tekstvak;
    private String fout;

    public void init(){
        //Label
        Label label = new Label("Voer het uur in");
        add(label);
        //Tekstvak
        tekstvak = new TextField ("", 10);
        add(tekstvak);
        //Knop
        Button toontijden = new Button();
        toontijden.setLabel("Toon Tijden");
        KnopListener kl = new KnopListener();
        toontijden.addActionListener( kl );
        add(toontijden);
    }

    public void paint(Graphics g){
        int y = 40;
        int x = 50;
        //Uitvoer if als >= 0 & <= 23 anders else
        if (tijd >= 0 && tijd <= 23) {
            g.drawString("Tijd in Amsterdam: " + tijd + ":00 uur", x, y);
            g.drawString("Tijd in London: " + tijdlondon + ":00 uur", x, y +20);
            g.drawString("Tijd in Tokyo: " + tijdtokyo + ":00 uur", x, y +40);
            g.drawString("Tijd in Sydney: " + tijdsydney + ":00 uur", x, y +60);
            g.drawString("Tijd in New York: " + tijdnewyork + ":00 uur", x, y +80);
        }
        else {
            g.drawString(fout, x, y);
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed (ActionEvent e){
            String s = tekstvak.getText();
            tijd = Integer.parseInt( s );
            if (tijd >= 0 && tijd <= 23){
                tijdlondon = tijd - 1;
                if (tijdlondon < 0){
                    tijdlondon = tijdlondon + 24;
                }
                tijdtokyo = tijd + 7;
                if (tijdtokyo > 23){
                    tijdtokyo = tijdtokyo - 24;
                }
                tijdsydney = tijd + 9;
                if (tijdsydney > 23) {
                    tijdsydney = tijdsydney - 24;
                }
                tijdnewyork = tijd - 6;
                if (tijdnewyork < 0) {
                    tijdnewyork = tijdnewyork + 24;
                }
            } else {
                fout = "Ongeldige invoer";
            }
            repaint();
        }
    }
}