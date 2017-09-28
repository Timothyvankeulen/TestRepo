package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet{
    TextField tekstvak1;
    TextField tekstvak2;
    Button keer;
    Button gedeeld;
    Button plus;
    Button min;
    int getal1;
    int getal2;
    double uitkomstkeer;
    double uitkomstgedeeld;
    double uitkomstplus;
    double uitkomstmin;

    public void init(){
        //Het eerste tekstvak
        tekstvak1 = new TextField("", 20);
        add (tekstvak1);
        //Het tweede tekstvak
        tekstvak2 = new TextField("", 20);
        add (tekstvak2);
        //Knop van Keer
        keer = new Button ();
        keer.setLabel(" * ");
        ListenerKeer lk = new ListenerKeer();
        keer.addActionListener( lk );
        add(keer);
        //Knop van Gedeeld
        gedeeld = new Button ();
        gedeeld.setLabel(" / ");
        ListenerGedeeld lg = new ListenerGedeeld();
        gedeeld.addActionListener( lg );
        add(gedeeld);
        //Knop van Plus
        plus = new Button ();
        plus.setLabel(" + ");
        ListenerPlus lp = new ListenerPlus();
        plus.addActionListener( lp );
        add(plus);
        //Knop van Min
        min = new Button ();
        min.setLabel(" - ");
        ListenerMin lm = new ListenerMin();
        min.addActionListener( lm );
        add(min);
    }

    public void paint(Graphics g){

    }

    class ListenerKeer implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String s1 = tekstvak1.getText();
            getal1 = Integer.parseInt( s1 );

            String s2 = tekstvak2.getText();
            getal2 = Integer.parseInt( s2 );

            uitkomstkeer = getal1 * getal2;
            tekstvak1.setText("" + uitkomstkeer);
            tekstvak2.setText("");
        }
    }

    class ListenerGedeeld implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String s1 = tekstvak1.getText();
            getal1 = Integer.parseInt( s1 );

            String s2 = tekstvak2.getText();
            getal2 = Integer.parseInt( s2 );

            uitkomstgedeeld = getal1 / getal2;
            tekstvak1.setText("" + uitkomstgedeeld);
            tekstvak2.setText("");
        }
    }

    class ListenerPlus implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String s1 = tekstvak1.getText();
            getal1 = Integer.parseInt( s1 );

            String s2 = tekstvak2.getText();
            getal2 = Integer.parseInt( s2 );

            uitkomstplus = getal1 + getal2;
            tekstvak1.setText("" + uitkomstplus);
            tekstvak2.setText("");
        }
    }

    class ListenerMin implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String s1 = tekstvak1.getText();
            getal1 = Integer.parseInt( s1 );

            String s2 = tekstvak2.getText();
            getal2 = Integer.parseInt( s2 );

            uitkomstmin = getal1 - getal2;
            tekstvak1.setText("" + uitkomstmin);
            tekstvak2.setText("");
        }
    }
}
