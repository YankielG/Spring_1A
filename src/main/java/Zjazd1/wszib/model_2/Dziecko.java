package Zjazd1.wszib.model_2;

import org.springframework.stereotype.Component;

@Component
public class Dziecko {
    public void daj(Prezent prezent){

        System.out.println("Mikołaj daj prezent : " + prezent.getNazwa());

    }
}
