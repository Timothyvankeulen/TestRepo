package H4;

import java.applet.*;
import java.awt.*;

public class PraktijkOpdracht extends Applet {

    public void init(){
    }

    public void paint(Graphics g){
        setBackground(Color.white);
        g.setColor(Color.black);
        //Lijn
        g.drawLine(15,20,165,20);
        g.drawString("Lijn", 75,35);
        //Rechthoek
        g.drawRect(15,40,150,75);
        g.drawString("Rechthoek",60,130);
        //Afgeronde Rechthoek
        g.drawRoundRect(15, 135, 150, 75, 30, 30);
        g.drawString("Afgeronde Rechthoek",45,225);
        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(185,40,150,75);
        g.setColor(Color.black);
        g.drawArc(185,40,150,75,0,360);
        g.drawString("Gevulde rechthoek met ovaal",185,130);
        //Gevulde Ovaal
        g.setColor(Color.magenta);
        g.fillArc(185,135,150,75,0,360);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",220,225);
        //Taartpunt met ovaal eromheen
        g.drawArc(360,40,150,75,0,360);
        g.setColor(Color.magenta);
        g.fillArc(360,40,150,75,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",360,130);
        //Cirkel
        g.drawOval(400,135,75,75);
        g.drawString("Cirkel",420,225);
    }

}
