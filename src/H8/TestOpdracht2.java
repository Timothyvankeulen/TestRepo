package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class TestOpdracht2 extends Applet {
    TextField tekstvak;
    Label label;
    int getal;
    int man;
    int vrouw;
    int totaal;
    Button knopman;
    Button knopvrouw;
    Button knoptotaal;

    public void init(){
        //Tekstvak en een label
        tekstvak = new TextField("", 20);
        label = new Label("Tel hoeveel mensen");
        tekstvak.addActionListener(new TekstvakListener());
        add (label);
        add (tekstvak);
        //Mannen Knop
        knopman = new Button ();
        knopman.setLabel("Man");
        ListenerMan lm = new ListenerMan();
        knopman.addActionListener( lm );
        add(knopman);
        //Vrouwen knop
        knopvrouw = new Button ();
        knopvrouw.setLabel("Vrouw");
        ListenerVrouw lv = new ListenerVrouw();
        knopvrouw.addActionListener( lv );
        add(knopvrouw);
        //Totaal knop
        knoptotaal = new Button ();
        knoptotaal.setLabel("Totaal");
        ListenerTotaal lt = new ListenerTotaal();
        knoptotaal.addActionListener( lt );
        add(knoptotaal);

    }

    public void paint(Graphics g){
        //g.drawString("Zoveel mensen zijn aanwezig: " + getal, 50,60);
        g.drawString("Er zijn zoveel mannen aanwezig: " + man, 50,60);
        g.drawString("Er zijn zoveel vrouwen aanwezig: " + vrouw, 50, 80);
        g.drawString("Er zijn zoveel mensen in totaal: " + totaal, 50,100);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt( s );
            repaint();
        }
    }

    class ListenerMan implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String s = tekstvak.getText();
            man = Integer.parseInt( s );
            repaint();
        }
    }

    class ListenerVrouw implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String s = tekstvak.getText();
            vrouw = Integer.parseInt( s );
            repaint();
        }
    }

    class ListenerTotaal implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String s = tekstvak.getText();
            totaal = Integer.parseInt( s );
            totaal = man + vrouw;
            repaint();
        }
    }
}
