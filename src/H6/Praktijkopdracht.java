package H6;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet{
    double a, b, c, d, uitkomst;

    public void init(){
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        uitkomst = (a + b + c) / d;
        uitkomst = uitkomst * 10;
        uitkomst = (int) uitkomst;
        uitkomst = uitkomst/10;
    }
    public void paint(Graphics g){
        g.drawString("Het gemiddelde is: " + uitkomst, 20,20);
    }
}
