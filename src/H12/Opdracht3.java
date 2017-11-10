package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class Opdracht3 extends Applet {
    TextField[] textFields = new TextField[5];
    private int[] getal = new int[5];
    Button Knop;

    public void init() {
        //Tabel textfields
        for (int teller = 0; teller < textFields.length; teller++) {
            textFields[teller] = new TextField("",5);
            add(textFields[teller]);
        }

        //Oke knop
        Knop = new Button();
        Knop.setLabel("Oke");
        ListenerKnop lk = new ListenerKnop();
        Knop.addActionListener (lk);
        add(Knop);
    }

    public void paint(Graphics g) {
    }

    class ListenerKnop implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            for (int teller = 0; teller < textFields.length; teller++) {
                String s = textFields[teller].getText();
                getal[teller] = Integer.parseInt(s);
            }
            Arrays.sort(getal);

            for (int teller = 0; teller < getal.length ; teller++) {
                textFields[teller].setText(String.valueOf(getal[teller]));
            }
        }
    }
}