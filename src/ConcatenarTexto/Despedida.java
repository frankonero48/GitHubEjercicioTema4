package ConcatenarTexto;

import java.util.Arrays;

public class Despedida {

    String [] despedida= new String[]{"Adiós", "Que tenga buen día", "Hasta la próxima"};

    public Despedida() {
    }

    public Despedida(String[] despedida) {
        this.despedida = despedida;
        for(int i=0; i<despedida.length; i++){
            System.out.println(despedida[i]);
        }
    }

    @Override
    public String toString() {
        return "Despedida{" +
                "despedida=" + Arrays.toString(despedida) +
                '}';
    }
}



