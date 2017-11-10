package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht6 extends Applet {
    TextField tekstvak;
    Button buttonOke;

    private boolean knopGeklikt;
    private boolean gevonden;
    private int[] waarde = {0, 1, 2, 2, 3, 3, 3, 4, 4, 5};
    private int invoer;
    private int aantal;

    public void init() {
        //Maakt TextField
        tekstvak = new TextField("", 5);
        add(tekstvak);

        //Maakt nieuwe button
        buttonOke = new Button();
        buttonOke.setLabel(" Oke ");
        ButtonListener bl = new ButtonListener();
        buttonOke.addActionListener(bl);
        add(buttonOke);
    }

    public void paint(Graphics g) {
        //Pas als er op de knop word geklikt word er iets weergegeven.
        if (knopGeklikt) {
            //Als de waarde is gevonden voer if uit anders else
            if (gevonden) {
                g.drawString("De waarde " + invoer + " is " + aantal + " keer gevonden.", 20, 50);
            }
            else {
                g.drawString("De waarde is niet gevonden.", 20, 50);
            }
        }
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            knopGeklikt = true;
            invoer = 0;

            //Invoer TextField
            String s1 = tekstvak.getText();
            invoer = Integer.parseInt(s1);

            //Zoekt waarde in tabel
            gevonden = false;
            aantal = 0;
            int teller = 0;
            while (teller < waarde.length) {
                if (waarde[teller] == invoer) {
                    gevonden = true;
                    aantal++;
                }
                teller++;
            }
            repaint();
        }
    }
}