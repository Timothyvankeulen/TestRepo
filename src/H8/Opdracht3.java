package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht3 extends Applet{
    TextField tekstvak;
    Label label;
    int getal;
    double btw;
    Button Ok;

    public void init() {
        //Tekstvak en een label
        tekstvak = new TextField("", 20);
        label = new Label("Typ een getal waar de BTW van berekent moet worden: ");
        tekstvak.addActionListener(new TekstvakListener());
        add (label);
        add (tekstvak);
        //Knop Oke
        Ok = new Button ();
        Ok.setLabel("Ok");
        ListenerOk lk = new ListenerOk();
        Ok.addActionListener( lk );
        add(Ok);
        //
        btw = 1.21;

    }

    public void paint(Graphics g){
        g.drawString("Dit is de uitkomst: " + getal * btw, 50,80);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt( s );
            repaint();
        }
    }

    class ListenerOk implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt( s );
            repaint();
        }
    }
}
