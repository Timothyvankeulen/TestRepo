package Challenges;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Staafdiagram extends Applet {
    //Tekstvak Valerie
    int getal1;
    int Valerie;
    Label label1;
    TextField tekstvak1;
    //Tekstvak Jeroen
    int getal2;
    int Jeroen;
    Label label2;
    TextField tekstvak2;
    //Tekstvak Hans
    int getal3;
    int Hans;
    Label label3;
    TextField tekstvak3;
    //Button
    Button toonknop;

    public void init(){
        //Tekstvak Valerie
        label1 = new Label("Valerie");
        add (label1);
        tekstvak1 = new TextField("", 4);
        add (tekstvak1);
        //Tekstvak Jeroen
        label2 = new Label("Jeroen");
        add (label2);
        tekstvak2 = new TextField("", 4);
        add (tekstvak2);
        //Tekstvak Hans
        label3 = new Label("Hans");
        add (label3);
        tekstvak3 = new TextField("", 4);
        add (tekstvak3);
        //Button
        toonknop = new Button();
        toonknop.setLabel("Toon");
        KnopListener kl = new KnopListener();
        toonknop.addActionListener( kl );
        add(toonknop);
        //Gewichten
        Valerie = 0;
        Jeroen = 0;
        Hans = 0;
    }

    public void paint(Graphics g){
        //Diagram
        g.drawLine(80, 100, 80, 220);
        g.drawLine(80, 220, 265, 220);
        //Gewichten
        g.drawString("120 Kg",25, 100);
        g.drawString("100 Kg",25,120);
        g.drawString("080 Kg",25,140);
        g.drawString("060 Kg",25,160);
        g.drawString("040 Kg",25,180);
        g.drawString("020 Kg",25,200);
        g.drawString("000 Kg",25,220);
        //Lijn gewicht
        g.drawLine(75,100,85, 100);
        g.drawLine(75,120,85, 120);
        g.drawLine(75,140,85, 140);
        g.drawLine(75,160,85, 160);
        g.drawLine(75,180,85, 180);
        g.drawLine(75,200,85, 200);
        g.drawLine(75,220,85, 220);
        //Staven personen
        g.drawRect(80, 220-Valerie, 40, Valerie);
        g.drawRect(160, 220-Jeroen, 40, Jeroen);
        g.drawRect(240, 220-Hans, 40, Hans);
        g.setColor(Color.red);
        g.fillRect(80, 220-Valerie, 40, Valerie);
        g.fillRect(160, 220-Jeroen, 40, Jeroen);
        g.fillRect(240, 220-Hans, 40, Hans);
        //Namen onder diagram
        g.setColor(Color.black);
        g.drawString("Valerie", 80, 240);
        g.drawString("Jeroen", 160, 240);
        g.drawString("Hans", 240, 240);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            //Gewicht tekstvak1
            String s1 = tekstvak1.getText();
            Valerie = Integer.parseInt( s1 );
            //Gewicht tekstvak2
            String s2 = tekstvak2.getText();
            Jeroen = Integer.parseInt( s2 );
            //Gewicht tekstvak3
            String s3 = tekstvak3.getText();
            Hans = Integer.parseInt( s3 );
            repaint();
        }
    }
}
