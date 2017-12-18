package H14;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.Random;

public class Opdracht2 extends Applet {
    Boolean Shuffle = false;
    Button Knop;
    String[] kaarten = { "Schoppen", "Klaver", "Harten", "Ruiten" };
    String[] soortKaarten = { "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "aas", "boer", "vrouw", "heer" };
    String[] deck;
    String[] speler1;
    String[] speler2;
    String[] speler3;
    String[] speler4;
    private URL pad;
    private AudioClip sound;

    public void init() {
        pad = Opdracht2.class.getResource("/resources/");
        sound = getAudioClip(pad, "applaus.wav");

        Knop = new Button();
        Knop.setLabel("Shuffle");
        KnopListener kl = new KnopListener();
        Knop.addActionListener( kl );
        add(Knop);

        deck = new String[52];
        speler1 = new String[13];
        speler2 = new String[13];
        speler3 = new String[13];
        speler4 = new String[13];
        int indexDeck = 0;

        for (int i = 0; i < kaarten.length ; i++) {
            String kleur = kaarten[i];
            for (int j = 0; j < soortKaarten.length; j++) {
                String kaart = soortKaarten[j];
                deck[indexDeck] = kleur + " " + kaart;
                indexDeck++;
            }
        }
        for (int i = 0; i < 13; i++) {
            speler1[i] = deelKaart();
            speler2[i] = deelKaart();
            speler3[i] = deelKaart();
            speler4[i] = deelKaart();
        }
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }

    public void paint(Graphics g) {
        if (Shuffle) {
            sound.play();
        }
        g.drawString("Speler 1 krijgt: ", 20, 45);
        g.drawString("Speler 2 krijgt: ", 120, 45);
        g.drawString("Speler 3 krijgt: ", 220, 45);
        g.drawString("Speler 4 krijgt: ", 320, 45);
        int x = 20;
        int y = 70;
        for (int i = 0; i < 13; i++) {
            g.drawString(speler1[i], x, y);
            x += 100;
            g.drawString(speler2[i], x, y);
            x += 100;
            g.drawString(speler3[i], x, y);
            x += 100;
            g.drawString(speler4[i], x, y);
            y += 30;
            x = 20;
        }

    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            Shuffle = true;
            deck = new String[52];
            speler1 = new String[13];
            speler2 = new String[13];
            speler3 = new String[13];
            speler4 = new String[13];
            int indexDeck = 0;

            for (int i = 0; i < kaarten.length ; i++) {
                String kleur = kaarten[i];
                for (int j = 0; j < soortKaarten.length; j++) {
                    String kaart = soortKaarten[j];
                    deck[indexDeck] = kleur + " " + kaart;
                    indexDeck++;
                }
            }
            for (int i = 0; i < 13; i++) {
                speler1[i] = deelKaart();
                speler2[i] = deelKaart();
                speler3[i] = deelKaart();
                speler4[i] = deelKaart();
            }
            repaint();
        }
    }
}