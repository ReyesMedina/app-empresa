package com.ibm.academia.appempresa;

import com.ibm.academia.appempresa.modelo.Gerente;

public class Main {

    public static void main(String[] args) {
        Gerente gerenteSucursalMexico = new Gerente("Pedro","Reyes","remp5",
                "Calle independencia 10",14000.0,12345,30000.0);

        System.out.println("El Gerente: " + gerenteSucursalMexico.toString());

       /* Modificar presupuesto
        gerenteSucursalMexico.setPresupuesto(40000.0);
        System.out.println("El Gerente " + gerenteSucursalMexico.toString());*/

        gerenteSucursalMexico.aumentarRemuneracion(50);
        System.out.println(gerenteSucursalMexico.getRemuneracion());

    }

}
