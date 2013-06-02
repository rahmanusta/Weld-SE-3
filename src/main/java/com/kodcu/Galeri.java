package com.kodcu;

import javax.inject.Inject;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Created with IntelliJ IDEA. User: usta Date: 3/22/13 Time: 5:33 PM To change
 * this template use File | Settings | File Templates.
 */
public class Galeri {

    @Inject
    @AracSecici(secBirini = Araclar.Otobus)
    private Arac arac;

    public static void main(String[] args) {

        Weld weld = new Weld();
        WeldContainer konteyner = weld.initialize();
        Galeri galeri = konteyner.instance().select(Galeri.class).get();
        
        String mesaj=galeri.arac.calis();
        System.out.println("> "+mesaj);
    }
}
