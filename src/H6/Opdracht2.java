package H6;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    int seconden;
    int minuten;
    int uren;
    int dag;
    int jaar;

    public void init(){
        seconden = 60;
        minuten = 60;
        uren = seconden * minuten;
        dag = 24;
        jaar = 365;
    }

    public void paint(Graphics g){
        //Hoeveel seconden in een uur.
        g.drawString("Er zitten zoveel seconden in een uur: " + seconden * minuten, 20, 20);
        //Hoeveel seconden in een dag.
        g.drawString("Er zitten zoveel seconden in een dag: " + (seconden * minuten) * dag, 20, 40);
        //Hoeveel seconden in een jaar.
        g.drawString("Er zitten zoveel seconden in een jaar: " + (seconden * minuten) * dag * jaar, 20, 60);
    }
}
