import java.awt.*;
import java.applet.*;


public class rekenen2 extends Applet {
    int a, b, c, d, e, f;
    double uitkomst;
    double antwoord;
    double berekening;

    public void init() {
        a = 60;
        b = 60;
        uitkomst = (a * b);

        c = 3600;
        d = 24;
        antwoord = (c * d);

        e = 86400;
        f = 365;
        berekening = (e * f);
    }

    public void paint(Graphics g) {
        g.drawString("Hoeveelheid seconden in een uur: " + uitkomst, 20, 20);
        g.drawString("Hoeveelheid seconden in een dag: " + antwoord, 20,40);
        g.drawString("Hoeveelheid seconden in een jaar: " + berekening ,20,60);

    }
}