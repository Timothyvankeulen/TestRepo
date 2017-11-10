package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht5 extends Applet {
    private TextField tekstvak;
    private Button buttonOke;

    private int index = 0;
    private boolean knopGeklikt;
    private boolean gevonden;
    private double[] salaris = {100.0, 200.0, 500.0, 400.0, 300.0};
    private double gezocht;

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
    }

    public void paint(Graphics g) {
        //Pas als er op de knop word geklikt word er iets weergegeven.
        if (knopGeklikt) {
            //Als de waarde is gevonden voer if uit anders else
            if (gevonden) {
                g.drawString("De waarde is gevonden.", 20, 50);
            }
            else {
                g.drawString("De waarde is niet gevonden.", 20, 50);
            }
            //Tekst op het scherm
            g.drawString("Index Positie is: " + index, 20, 80);
            g.drawString("" + gezocht, 20, 110);
        }
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            knopGeklikt = true;
            gezocht = 0;

            //Invoer TextField
            String s1 = tekstvak.getText();
            gezocht = Double.parseDouble(s1);

            //Zoekt waarde in tabel
            gevonden = false;
            int teller = 0;
            while (teller < salaris.length) {
                System.out.println("Index is: " + teller);
                if (salaris[teller] == gezocht) {
                    gevonden = true;
                    index = teller;
                    break;
                }
                teller++;
            }
            repaint();
        }
    }
}