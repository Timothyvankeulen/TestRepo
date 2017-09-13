package H2;
/*

@(#)H2.Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek

import java.awt.*;
import java.applet.*;

//een klasse met de naam H2 van het type Applet
public class H2 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Timothy", 50, 60 );
        g.setColor(Color.red);
        g.drawString("van Keulen", 50, 75 );
    }

}