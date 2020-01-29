package Zjazd1.wszib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import Zjazd1.wszib.model_4.Figura;
import Zjazd1.wszib.model_3.Kalkulator;



//@SpringBootApplication(scanBasePackages = {"Zjazd1.wszib.model5"})
 //tak definiujemy co konkretnie chcemy odplic(w przeciwnym razie uruchamia wszystko)

@SpringBootApplication
public class WszibApplication {

	public static void main(String[] args) {
		System.out.println(Kalkulator.getInstance().dodaj(2,2));
        System.out.println(Figura.kwadrat(4).pole());
		SpringApplication.run(WszibApplication.class, args);

	}

}
