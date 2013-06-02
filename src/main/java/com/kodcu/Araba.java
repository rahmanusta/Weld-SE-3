package com.kodcu;

import javax.enterprise.inject.Default;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 3/22/13
 * Time: 5:31 PM
 * To change this template use File | Settings | File Templates.
 */
@Default
public class Araba implements Arac{

    public String calis() {
        return "Araba "+hizSoyle()+" km. hızında çalışıyor..";
    }

    public int hizSoyle(){

        return ThreadLocalRandom.current().nextInt(20, 240) ;
    }

}
