package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    Button okeknop;
    Button resetknop;

    public void init(){
        //Tekstvak en een label
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener(new TekstvakListener());
        add (label);
        add (tekstvak);
        //Oke knop
        okeknop = new Button();
        okeknop.setLabel("Oke");
        KnopListener kl = new KnopListener();
        okeknop.addActionListener( kl );
        add(okeknop);
        //Reset knop
        resetknop = new Button();
        resetknop.setLabel("Reset");
        Knop1 kl1 = new Knop1();
        resetknop.addActionListener( kl1 );
        add(resetknop);
    }

    public void paint(Graphics g) {
        g.drawString("Het getal is " + getal, 50, 60 );
        //g.drawString(schermtekst,50, 60);
    }
    //Enter knop verstuurd antwoord.
    class TekstvakListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }
    //Oke knop verstuurd antwoord.
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }
    //Reset knop, reset heel het tekstvak.
    class Knop1 implements ActionListener {
        public void actionPerformed( ActionEvent e){
            tekstvak.setText("");
            repaint();
        }
    }
}
