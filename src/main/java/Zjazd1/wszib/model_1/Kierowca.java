package Zjazd1.wszib.model_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kierowca {

//@Autowired
   private Kluczyki kluczyki;
    //
//@Autowired
    private PrawoJazdy prawoJazdy;

        @Autowired
    public void setPrawoJazdy(PrawoJazdy prawoJazdy) {
        this.prawoJazdy = prawoJazdy;
    }

//     tak jak w samochodzie do zadeklarowania zaleznosci pomiedzy obiekrtami najlepiej wykorzystac konstruktor
        @Autowired
    public void setKluczyki(Kluczyki kluczyki) {
        this.kluczyki = kluczyki;
    }
//
    public Kierowca(Kluczyki kluczyki, PrawoJazdy prawoJazdy) {
        this.kluczyki = kluczyki;
        this.prawoJazdy = prawoJazdy;
    }


}