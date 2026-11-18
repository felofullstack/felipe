package POO.Momento3;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //Me encuentro en el piso 5 y presiono el botón de bajar
        Boton botonBajarPiso5 = new BotonPiso(true, true, 5, "bajar");
        botonBajarPiso5.presionarBoton();
        System.out.println(botonBajarPiso5);
        System.out.println("Se abren las puertas del piso....");
        System.out.println("Se abren las puertas del ascensor....");
        System.out.println("Entra la persona al ascensor");
        System.out.println("Presiona el boton que lo lleva al piso 1");
        Boton botonPiso1 = new BotonAscensor(true, true, 5, 1);
        botonPiso1.presionarBoton(); //Muestra si está subiendo o esta bajando....
        System.out.println(botonPiso1);

        
    }
}


