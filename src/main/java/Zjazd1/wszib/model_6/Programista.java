package Zjazd1.wszib.model_6;

import org.springframework.stereotype.Component;

@Component
public class Programista {

    private EkspresDoKawy ekspresDoKawy;
    private Komputer komputer;

    public Programista(EkspresDoKawy ekspresDoKawy, Komputer komputer) {
        this.ekspresDoKawy = ekspresDoKawy;
        this.komputer = komputer;
    }
}
