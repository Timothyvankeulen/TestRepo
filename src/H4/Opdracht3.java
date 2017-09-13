package H4;

import java.applet.*;
import java.awt.*;

public class Opdracht3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        setBackground(Color.white);
        g.setColor(Color.black);
        //Vlaggenstok
        g.drawLine(25,50,25,175);
        g.drawLine(45,55,45,175);
        g.drawOval(25,45,20,10);
        g.drawOval(25,170,20,10);
        //Eerste vlak van de vlag
        g.setColor(Color.red);
        g.fillRect(45,50,100,15);
        g.setColor(Color.black);
        g.drawRect(45,50,100,15);
        //Tweede vlak van de vlag
        g.drawRect(45,65,100,15);
        //Derde vlak van de vlag
        g.setColor(Color.blue);
        g.fillRect(45,80,100,15);
        g.setColor(Color.black);
        g.drawRect(45,80,100,15);
    }

}
