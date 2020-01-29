package Zjazd1.wszib.model_6;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration("6")
@Configuration
public class Config_Programisci {

    @Bean
    public Programista programista1(EkspresDoKawy EkspresDoKawy, Komputer komputer) {
        return new Programista(EkspresDoKawy, komputer);
    }

    @Bean
    public Programista programista2(EkspresDoKawy EkspresDoKawy, Komputer komputer) {
        return new Programista(EkspresDoKawy, komputer);
    }

    @Bean
    public Programista programista3(EkspresDoKawy EkspresDoKawy, Komputer komputer) {
        return new Programista(EkspresDoKawy, komputer);
    }

    @Bean
    public Programista programista4(EkspresDoKawy EkspresDoKawy, Komputer komputer) {
        return new Programista(EkspresDoKawy, komputer);
    }

    @Bean
    public Programista programista5(EkspresDoKawy EkspresDoKawy, Komputer komputer) {
        return new Programista(EkspresDoKawy, komputer);
    }
}