package com.kodcu;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 27.05.2013
 * Time: 18:21
 * To change this template use File | Settings | File Templates.
 */
public class Traktor implements Arac {

    public String calis() {
        return "Traktör "+hizSoyle()+" km. hızında çalışıyor..";
    }

    public int hizSoyle(){

        return ThreadLocalRandom.current().nextInt(20, 110) ;
    }

}
