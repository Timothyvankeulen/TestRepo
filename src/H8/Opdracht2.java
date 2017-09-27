package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht2 extends Applet{
    Button knopman;
    Button knopvrouw;
    Button knopPman;
    Button knopPvrouw;
    int man;
    int vrouw;
    int Pman;
    int Pvrouw;
    int totaal;

    public void init(){
        //Knop van de man
        knopman = new Button("Man");
        ListenerMan lm = new ListenerMan();
        knopman.addActionListener( lm );
        add(knopman);
        //Knop van de vrouw
        knopvrouw = new Button("Vrouw");
        ListenerVrouw lv = new ListenerVrouw();
        knopvrouw.addActionListener( lv );
        add(knopvrouw);
        //Knop van de Potentiële man
        knopPman = new Button("PMan");
        ListenerPMan lpm = new ListenerPMan();
        knopPman.addActionListener( lpm );
        add(knopPman);
        //Knop van de Potentiële vrouw
        knopPvrouw = new Button("PVrouw");
        ListenerPVrouw lpv = new ListenerPVrouw();
        knopPvrouw.addActionListener( lpv );
        add(knopPvrouw);
    }

    public void paint(Graphics g){
        g.drawString("Er zijn zoveel mannen: " + man, 50,60);
        g.drawString("Er zijn zoveel vrouwen: " + vrouw, 50, 80);
        g.drawString("Er zijn zoveel Potentiële mannen: " + Pman, 50, 100);
        g.drawString("Er zijn zoveel Potentiële vrouwen: " + Pvrouw, 50, 120);
        g.drawString("Er zijn in totaal zoveel mensen: " + totaal, 50,140);
    }

    class ListenerMan implements ActionListener {
        public void actionPerformed (ActionEvent e){
            man++;
            totaal++;
            repaint();
        }
    }

    class ListenerVrouw implements ActionListener {
        public void actionPerformed (ActionEvent e){
            vrouw++;
            totaal++;
            repaint();
        }
    }

    class ListenerPMan implements ActionListener {
        public void actionPerformed (ActionEvent e){
            Pman++;
            totaal++;
            repaint();
        }
    }

    class ListenerPVrouw implements ActionListener {
        public void actionPerformed (ActionEvent e){
            Pvrouw++;
            totaal++;
            repaint();
        }
    }
}
