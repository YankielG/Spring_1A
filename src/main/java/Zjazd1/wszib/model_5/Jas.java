package Zjazd1.wszib.model_5;

import org.springframework.stereotype.Component;

@Component
public class Jas {

    public Jas(Ciastko ciastko){
        if(ciastko.uzgryz()){
            System.out.println("Jas: Mniam");
        } else {
            System.out.println("Malgosia: już ugryzione");
        }

    }

}
