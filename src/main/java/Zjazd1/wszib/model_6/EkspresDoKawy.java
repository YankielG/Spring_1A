package Zjazd1.wszib.model_6;

import org.springframework.stereotype.Component;

@Component
public class EkspresDoKawy {

    public static int i = 0;

    public EkspresDoKawy() {
        System.out.println("Ekspres do kawy : " + i++);
    }


}
