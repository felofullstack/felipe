package POO.Momento3;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //Me encuentro en el piso 5 y presiono el botón de bajar
        Boton botonBajarPiso5 = new BotonPiso(true, true, 5, "bajar");
        botonBajarPiso5.presionarBoton();
        System.out.println(botonBajarPiso5);
        
        
    }
}


