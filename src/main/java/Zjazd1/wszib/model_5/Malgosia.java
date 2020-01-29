package Zjazd1.wszib.model_5;

import org.springframework.stereotype.Component;

@Component
public class Malgosia {

    public Malgosia(Ciastko ciastko){
        if(ciastko.uzgryz()){
            System.out.println("Malgosia: Mniam");
        } else {
            System.out.println("Jas: już ugryzione");
        }

    }

}