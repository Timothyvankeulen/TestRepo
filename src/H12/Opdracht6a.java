package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht6a extends Applet {
    TextField tekstvak;
    Button buttonOke;

    private int index = 0;
    private boolean knopGeklikt;
    private boolean gevonden;
    private int[] waarde = {0, 1, 2, 2, 3, 3, 3, 4, 4, 5};
    private int gezocht;
    int aantal;

    public void init() {
        //Maakt TextField
        tekstvak = new TextField("", 5);
        add(tekstvak);

        //Maakt nieuwe button (buttonOke)
        buttonOke = new Button();
        buttonOke.setLabel(" Oke ");
        ButtonListener bl = new ButtonListener();
        buttonOke.addActionListener(bl);
        add(buttonOke);

        aantal = 0;
    }

    public void paint(Graphics g) {
        //Pas als er op de knop word geklikt word er iets weergegeven.
        if (knopGeklikt) {
            //Als de waarde is gevonden voer if uit anders else
            if (gevonden) {
                g.drawString("De waarde " + gezocht + " is " + index + " keer gevonden.", 20, 50);
            }
            else {
                g.drawString("De waarde is niet gevonden.", 20, 50);
            }

            //Tekst op het scherm
            g.drawString("Index Positie is: " + index, 20, 80);
        }
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            knopGeklikt = true;
            gezocht = 0;

            //Invoer TextField
            String s1 = tekstvak.getText();
            gezocht = Integer.parseInt(s1);
            repaint();

            //Zoekt waarde in tabel
            gevonden = false;
            int teller = 0;
            while (teller < waarde.length) {
                if (waarde[teller] == gezocht) {
                    gevonden = true;
                    index = teller;
                }
                teller++;
            }
            repaint();
        }
    }
}