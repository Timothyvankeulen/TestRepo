package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    Button[] buttons = new Button[25];
    int teller;

    public void init() {
        for (Button button : buttons) {
            teller++;
            button = new Button();
            button.setLabel("" + teller);
            add(button);
            button.setEnabled(false);
        }
    }

    public void paint(Graphics g) {
    }
}