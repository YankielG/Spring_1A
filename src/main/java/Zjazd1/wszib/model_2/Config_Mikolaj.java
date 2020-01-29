package Zjazd1.wszib.model_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration("2")
@Configuration
public class Config_Mikolaj {

    @Bean
    public Prezent dlaMateusza(){
        return new Prezent("dron1");
    }

    @Bean
    public Prezent dlaKlaudi(){
        return new Prezent("lalka");
    }

    @Bean
    public Prezent dlaBartka(){
        return new Prezent("klocki");
    }
}
