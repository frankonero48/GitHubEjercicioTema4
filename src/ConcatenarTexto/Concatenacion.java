package ConcatenarTexto;

public class Concatenacion {

    public static void main(String[] args) {

        //Imprime la cadena de saludos concatenada.
        Saludo entrada=new Saludo();
        System.out.println(entrada.saludo[0]+" "+ entrada.saludo[1]+" "+entrada.saludo[2]);


        //Imprime la cadena de despedida concatenada.
        Despedida salida=new Despedida();
        System.out.println(salida.despedida[0]+" "+salida.despedida[1]+" "+salida.despedida[2]);


        //Imprime valores concretos tanto de saludo como de despedida concatenados
        System.out.print(entrada.saludo[2]+" "+salida.despedida[1]+" ");
        System.out.print(entrada.saludo[0]+" "+salida.despedida[2]+" ");
        System.out.print(entrada.saludo[1]+" "+salida.despedida[0]);

    }




}



