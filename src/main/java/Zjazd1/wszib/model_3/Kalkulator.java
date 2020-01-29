package Zjazd1.wszib.model_3;

public class Kalkulator {

    private static Kalkulator INSTANCE = new Kalkulator();

    private Kalkulator() {
    }

    public static Kalkulator getInstance(){
        return INSTANCE;
    }

    public int dodaj(int a, int b){
        return a + b;
    }

}
