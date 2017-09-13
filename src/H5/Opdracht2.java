package H5;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    int valerie;
    int jeroen;
    int hans;

    public void init(){
        valerie = 40;
        jeroen = 100;
        hans = 80;
    }

    public void paint(Graphics g){
        //Kilo's
        g.drawString("180 Kg",25, 20);
        g.drawString("160 Kg",25, 40);
        g.drawString("140 Kg",25, 60);
        g.drawString("120 Kg",25, 80);
        g.drawString("100 Kg",25,100);
        g.drawString("080 Kg",25,120);
        g.drawString("060 Kg",25,140);
        g.drawString("040 Kg",25,160);
        g.drawString("020 Kg",25,180);
        g.drawString("000 Kg",25,200);
        //Diagram
        g.drawLine(75,200,280,200);
        g.drawLine(75,10,75,200);
        //Namen
        g.drawString("Valerie",85,215);
        g.drawString("Jeroen",165,215);
        g.drawString("Hans",245,215);
        //Staaf Valerie
        g.setColor(Color.red);
        g.fillRect(90,200-valerie,30,valerie);
        g.setColor(Color.black);
        g.drawRect(90,200-valerie,30,valerie);
        //Staaf Jeroen
        g.setColor(Color.green);
        g.fillRect(170,200-jeroen,30,jeroen);
        g.setColor(Color.black);
        g.drawRect(170,200-jeroen,30,jeroen);
        //Staaf Hans
        g.setColor(Color.blue);
        g.fillRect(250,200-hans,30,hans);
        g.setColor(Color.black);
        g.drawRect(250,200-hans,30,hans);
    }
}
