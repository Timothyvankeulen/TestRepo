package Challenges;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class FruitAutomaat extends Applet{
    private int krediet = 10;
    Button speelKnop;
    Button kredietKnop;
    private URL pad;


    public void init(){
        //SpeelKnop
        speelKnop = new Button();
        speelKnop.setLabel("Speel");
        KnopListener1 kl1 = new KnopListener1();
        speelKnop.addActionListener( kl1 );
        add(speelKnop);
        //KredietKnop
        kredietKnop = new Button();
        kredietKnop.setLabel("Koop 10 punten");
        KnopListener2 kl2 = new KnopListener2();
        kredietKnop.addActionListener( kl2 );
        add(kredietKnop);

        pad = FruitAutomaat.class.getResource("/Fruitplaatjes/");

        //Speelknop niet klikbaar met 0 krediet
        if (krediet == 0){
            speelKnop.setEnabled(false);
        }
        else {
            speelKnop.setEnabled(true);
        }
        //Kredietknop klikbaar met 0 krediet
        if (krediet == 0){
            kredietKnop.setEnabled(true);
        }
        else {
            kredietKnop.setEnabled(false);
        }

    }


    public void paint(Graphics g){
        plaatjes (g);
        g.drawString("U heeft zoveel krediet: " + krediet, 50,200);
        //Als er geen krediet is, speelknop uitgezet en kredietknop aangezet (anders else)
        if (krediet == 0){
            speelKnop.setEnabled(false);
            kredietKnop.setEnabled(true);
        }
        else {
            speelKnop.setEnabled(true);
            kredietKnop.setEnabled(false);
        }
    }

    private void plaatjes(Graphics g){

    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            do {
                krediet--;
            } while (krediet < 0);
            repaint();
        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (krediet == 0)
            krediet = krediet + 10;
            repaint();
        }
    }
}
