package ConcatenarTexto;

import java.util.Arrays;

public class Saludo {

    String [] saludo= new String[]{"Hola", "Buenos días", "¿Que tal?"};

    public Saludo() {
    }

    public Saludo(String[] saludo) {
        this.saludo = saludo;
        for(int i=0; i<saludo.length; i++){
            System.out.println(saludo[i]);
        }
    }

    @Override
    public String toString() {
        return "Saludo{" +
                "saludo=" + Arrays.toString(saludo) +
                '}';
    }
}


