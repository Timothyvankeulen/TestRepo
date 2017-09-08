package H4;

import java.applet.*;
import java.awt.*;

public class Opdracht4 extends Applet{

    public void init(){
    }

    public void paint(Graphics g){
        //Kilo's
        g.drawString("100 Kg",25,30);
        g.drawString("080 Kg",25,60);
        g.drawString("060 Kg",25,90);
        g.drawString("040 Kg",25,120);
        g.drawString("020 Kg",25,150);
        g.drawString("000 Kg",25,180);
        //Diagram
        g.drawLine(75,20,75,180);
        g.drawLine(75,180,280,180);
        //Namen
        g.drawString("Valerie",85,195);
        g.drawString("Jeroen",165,195);
        g.drawString("Hans",245,195);
        //Staaf Valerie
        g.drawRect(90,115,30,65);
        //Staaf Jeroen
        g.drawRect(170,25,30,155);
        //Staaf Hans
        g.drawRect(250,55,30,125);
    }

}
