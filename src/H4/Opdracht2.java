package H4;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        setBackground(Color.white);
        g.setColor(Color.black);
        //Het dak van het huis
        g.drawLine(50,100,150,100);
        g.drawLine(100,50,150,100);
        g.drawLine(100,50,50,100);
        //Het blok van het huis
        g.drawRect(50,100,100,100);
        //Het raam in het huis
        g.drawRect(60,115,25,25);
        //De deur in het huis
        g.drawRect(120,160,15,40);
        g.drawOval(128,175,4,4);
    }
}