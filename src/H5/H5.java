package H5;

import java.applet.Applet;
import java.awt.*;

public class H5 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init(){
    opvulkleur = Color.magenta;
    lijnkleur = Color.black;
    breedte = 150;
    hoogte = 75;
    }

    public void paint(Graphics g){
        //Lijn
        g.drawLine(15,20,165,20);
        g.drawString("Lijn", 75,35);
        //Rechthoek
        g.drawRect(15,40,breedte,hoogte);
        g.drawString("Rechthoek",60,130);
        //Afgeronde Rechthoek
        g.drawRoundRect(15, 135, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde Rechthoek",45,225);
        //Gevulde rechthoek met ovaal
        g.setColor(opvulkleur);
        g.fillRect(185,40,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawArc(185,40,breedte,hoogte,0,360);
        g.drawString("Gevulde rechthoek met ovaal",185,130);
        //Gevulde Ovaal
        g.setColor(opvulkleur);
        g.fillArc(185,135,breedte,hoogte,0,360);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal",220,225);
        //Taartpunt met ovaal eromheen
        g.drawArc(360,40,breedte,hoogte,0,360);
        g.setColor(opvulkleur);
        g.fillArc(360,40,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen",360,130);
        //Cirkel
        g.drawOval(400,135,75,hoogte);
        g.drawString("Cirkel",420,225);
    }
}
