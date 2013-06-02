package com.kodcu;

import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 27.05.2013
 * Time: 18:23
 * To change this template use File | Settings | File Templates.
 */
@Target({ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface AracSecici {
    Araclar secBirini();
}
