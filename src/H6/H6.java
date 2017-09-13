package H6;

import java.applet.Applet;
import java.awt.*;

public class H6 extends Applet {
    int totaal;
    double berekening;
    double uitkomst;


    public void init(){
        totaal = 113;
        berekening = 4;
        uitkomst  = totaal/berekening;
    }

    public void paint(Graphics g){
        g.drawString("Het totaal is: " + totaal, 20, 20);
        g.drawString("Jan zijn hoeveelheid: " + uitkomst,20,40);
        g.drawString("Ali zijn hoeveelheid: " + uitkomst,20,60);
        g.drawString("Jeannette haar hoeveelheid: " + uitkomst,20,80);
        g.drawString("Mijn hoeveelheid: " + uitkomst,20,100);
    }
}
