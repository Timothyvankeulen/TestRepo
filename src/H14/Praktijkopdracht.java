package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class Praktijkopdracht extends Applet {
    TextField tekstvak;
    Button resetknop;
    Label label;
    //Invoer en Smileys
    private int smileys = 23;
    private int getal = 0;
    //Random Getal
    double r;
    int randomGetal;
    //Booleans die waarden checken
    private boolean invoer;
    private boolean uitgevoerd;
    private boolean winRate;
    //Afbeeldingen
    private Image afbeelding1;
    private Image afbeelding2;
    private URL pad;

    public void init() {
        //Label
        label = new Label("Haal 1, 2 of 3 Smileys weg.");
        add(label);
        //Tekstvak
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
        //ResetKnop
        resetknop = new Button();
        resetknop.setLabel("Reset");
        KnopListener kl = new KnopListener();
        resetknop.addActionListener( kl );
        add(resetknop);
        //Afbeeldingen
        pad = Praktijkopdracht.class.getResource("/resources/");
        afbeelding1 = getImage(pad, "smiley.png");
        afbeelding2 = getImage(pad, "happysmiley.png");
    }

    public void paint(Graphics g) {
        g.drawString("U heeft nog: " + smileys + " smileys ", 20, 40);
        //Winrate met laatste invoer
        if ((winRate) && (smileys <= 0)) {
            g.drawString("U heeft gewonnen." , 20, 60);
            g.drawImage(afbeelding2, 20, 80, 100, 100, this);
        }
        else if ((!winRate) && (smileys <= 0)){
            g.drawString("U heeft verloren.", 20, 60);
            g.drawImage(afbeelding1, 20, 80, 100, 100, this);
        }
        if ((getal == 0) && (invoer) || (getal >= 4) && (invoer)) {
            g.drawString("Onjuiste invoer", 160, 40);
        }

        int x = 20;
        int y = 50;
        for (int teller = 0; teller < smileys; teller++) {
            if (teller == 4 || teller == 8 || teller == 12 || teller == 16 || teller == 20) {
                y += 50;
                x = 20;
            }
            g.drawImage(afbeelding1, x, y, 50, 50, this);
            x += 50;
        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);
            //Checkt waarde
            invoer = true;
            winRate = false;
            uitgevoerd = false;
            //Random Getal
            r = Math.random();
            randomGetal = (int) (r * 3 + 1);

            if (!(smileys <= 0) && !(getal >= 4)) {
                if (!(smileys == 2) && (getal == 3) || !(smileys == 1) && (getal == 2) || !(smileys == 1) && (getal == 1) || (smileys == 1) && (getal == 1) || (smileys == 1) && (getal == 3)) {
                    smileys = smileys - getal;
                    uitgevoerd = true;
                    winRate = false;
                }
            }
            if ((smileys == 20) || (smileys == 16) || (smileys == 12) || (smileys == 8) || (smileys == 4)) {
                if (uitgevoerd) {
                    smileys -= 3;
                    uitgevoerd = false;
                    winRate = true;
                }
            }
            if ((smileys == 19) || (smileys == 15) || (smileys == 11) || (smileys == 7) || (smileys == 3)) {
                if (uitgevoerd) {
                    smileys -= 2;
                    uitgevoerd = false;
                    winRate = true;
                }
            }
            if ((smileys == 22) || (smileys == 18) || (smileys == 14) || (smileys == 10) || (smileys == 6) || (smileys == 2) || (smileys == 1)) {
                if (uitgevoerd) {
                    smileys -= 1;
                    uitgevoerd = false;
                    winRate = true;
                }
            }
            if ((smileys == 21) || (smileys == 17) || (smileys == 13) || (smileys == 9) || (smileys == 5)) {
                if (uitgevoerd) {
                    smileys -= randomGetal;
                    uitgevoerd = false;
                    winRate = true;
                }
            }
            repaint();
        }
    }

    //Reset Knop
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            smileys = 23;
            repaint();
        }
    }
}